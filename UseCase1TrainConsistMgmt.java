import java.util.ArrayList;
import java.util.List;
class UseCase1TrainConsistMgmt {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println("Current train consist: " + bogies);
    }
}
