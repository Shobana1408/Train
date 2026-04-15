import java.util.LinkedList;
class UseCase4TrainConsistMgmt {
    public static void main(String[] args) {
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        trainConsist.add(2, "Pantry Car");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("Final Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}
