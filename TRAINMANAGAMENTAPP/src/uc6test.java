package test;

import main.UseCase6BogieCapacityMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase6BogieCapacityMapTest {

    @Test
    void testAddBogie() {
        UseCase6BogieCapacityMap map = new UseCase6BogieCapacityMap();
        map.addBogie("Sleeper", 72);

        assertEquals(72, map.getCapacity("Sleeper"));
    }

    @Test
    void testMultipleBogies() {
        UseCase6BogieCapacityMap map = new UseCase6BogieCapacityMap();

        map.addBogie("Sleeper", 72);
        map.addBogie("AC Chair", 60);
        map.addBogie("First Class", 40);

        assertEquals(72, map.getCapacity("Sleeper"));
        assertEquals(60, map.getCapacity("AC Chair"));
        assertEquals(40, map.getCapacity("First Class"));
    }

    @Test
    void testTotalBogies() {
        UseCase6BogieCapacityMap map = new UseCase6BogieCapacityMap();

        map.addBogie("Sleeper", 72);
        map.addBogie("AC Chair", 60);

        assertEquals(2, map.getTotalBogies());
    }

    @Test
    void testUnknownBogie() {
        UseCase6BogieCapacityMap map = new UseCase6BogieCapacityMap();

        assertEquals(0, map.getCapacity("Unknown"));
    }
}