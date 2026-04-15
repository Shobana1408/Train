import java.util.LinkedHashSet;
class UseCase5TrainConsistMgmt {
    public static void main(String[] args) {
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
        System.out.println("Final Train Formation:");
        System.out.println(formation);
    }
}
