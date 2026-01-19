import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the signal: ");
        String signal = input.nextLine();

        switch (signal) {
            case "RED":
                System.out.println("Stop! Wait for the light to turn green.");
                break;
            case "YELLOW":
                System.out.println("Prepare to stop or proceed with caution.");
                break;
            case "GREEN":
                System.out.println("Go! The path is clear.");
                break;
            default:
                System.out.println("Invalid signal color.");
        }
    }
}