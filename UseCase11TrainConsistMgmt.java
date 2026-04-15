import java.util.regex.Pattern;
class UseCase11TrainConsistMgmt {
    public static void main(String[] args) {
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";
        boolean validTrainId = Pattern.matches("TRN-\\d{4}", trainId);
        boolean validCargoCode = Pattern.matches("PET-[A-Z]{2}", cargoCode);
        System.out.println("Train ID: " + trainId + " -> " + (validTrainId ? "Valid" : "Invalid"));
        System.out.println("Cargo Code: " + cargoCode + " -> " + (validCargoCode ? "Valid" : "Invalid"));
    }
}
