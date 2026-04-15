import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class UseCase7TrainConsistMgmt {
    static class Bogie {
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}
