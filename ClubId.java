import java.util.Scanner; 

class ClubId {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Underage, not allowed inside the club.");
        } 
        else {
            System.out.println("Within age, may go inside.");
        }
        
        input.close();     }
}