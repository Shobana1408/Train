public class UseCase18TrainConsistMgmt {
    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchId = "BG309";
        boolean found = false;
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }
        System.out.println();
        if (found) {
            System.out.println("Bogie ID " + searchId + " found.");
        } else {
            System.out.println("Bogie ID " + searchId + " not found.");
        }
    }
}
