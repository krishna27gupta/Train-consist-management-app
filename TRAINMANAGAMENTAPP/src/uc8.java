package main;

public class UseCase9Bogie {

    private String name;
    private int capacity;

    public UseCase9Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}