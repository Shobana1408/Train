import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class UseCase8TrainConsistMgmt {
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
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies:");
        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}
