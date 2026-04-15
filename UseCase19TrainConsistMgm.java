import java.util.Arrays;
public class UseCase19TrainConsistMgmt {
    public static void main(String[] args) {
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String key = "BG309";
        boolean found = false;
        Arrays.sort(bogieIds);
        int low = 0;
        int high = bogieIds.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogieIds[mid]);
            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        System.out.println();
        if (found) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }
    }
}
