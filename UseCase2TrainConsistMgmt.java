import java.util.ArrayList;
import java.util.List;
class UseCase2TrainConsistMgmt {
    public static void main(String[] args) {
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair:");
        System.out.println("Passenger Bogies: " + passengerBogies);
        System.out.println("Contains Sleeper? " + passengerBogies.contains("Sleeper"));
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
    }
}
