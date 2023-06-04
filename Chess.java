import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you wish to set up a new chessboard? (Y/N), if N is selected you will be asked to enter a valid FEN code: ");
        String userInput = scanner.nextLine().toUpperCase();
        
        while (!userInput.equals("Y") && !userInput.equals("N")) {
            System.out.print("Invalid input. Please enter Y or N: ");
            userInput = scanner.nextLine().toUpperCase();
        }
        
        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
