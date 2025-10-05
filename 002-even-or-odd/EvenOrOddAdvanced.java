import java.util.Scanner;

public class MainAdvanced{
    /**
     * Determines whether a number is even or odd and displays the result.
     * @param num integer to check
     */
    static void evenOrOdd(int num){
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.printf("Number %d is %s%n", num, result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            System.out.print("Enter an integer: ");
            if(scanner.hasNextInt()){
                int num = scanner.nextInt();
                evenOrOdd(num);
                validInput = true;
            } else{
                System.out.println("Invalid input! Please enter an integer!");
                scanner.next();
            }
        }
        scanner.close();
    }
}