public class UseCase20TrainConsistMgmt {
    public static void main(String[] args) {
        String[] bogieIds = {};
        String searchId = "BG101";
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }
        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Bogie ID " + searchId + " found.");
        } else {
            System.out.println("Bogie ID " + searchId + " not found.");
        }
        System.out.println("UC20 execution completed.");
    }
}
