import java.util.HashSet;
import java.util.Set;
class UseCase3TrainConsistMgmt {
    public static void main(String[] args) {
        Set<String> bogies = new HashSet<>();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);
    }
}
