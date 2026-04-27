import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String type;

    Bogie(String type) {
        this.type = type;
    }
}

public class UC13_PerformanceComparison {

    public static void main(String[] args) {

        // Step 1: Create sample bogie list
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie(i % 2 == 0 ? "GOODS" : "PASSENGER"));
        }

        // =========================
        // LOOP BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if ("GOODS".equals(b.type)) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // STREAM BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> "GOODS".equals(b.type))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // OUTPUT RESULTS
        // =========================
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Program continues...
    }
}