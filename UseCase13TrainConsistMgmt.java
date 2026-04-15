import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class UseCase13TrainConsistMgmt {
    static class Bogie {
        String type;
        int capacity;
        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long startStream = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        System.out.println("Loop result count: " + loopResult.size());
        System.out.println("Loop time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream result count: " + streamResult.size());
        System.out.println("Stream time: " + (endStream - startStream) + " ns");
    }
}
