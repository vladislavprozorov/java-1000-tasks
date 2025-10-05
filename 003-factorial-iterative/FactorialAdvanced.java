import java.util.Scanner;
public class FactorialAdvanced{
    /**
     * Calculates the factorial of a non-negative integer iteratively.
     * @param num the number to calculate factorial for
     * @return factorial of {@code num}
     */
    static long factorial(long num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            System.out.print("Enter a non-negative integer: ");
            if(scanner.hasNextLong()){
                long num = scanner.nextLong();
                if(num >= 0){
                    long fact = factorial(num);
                    validInput = true;
                    System.out.printf("Factorial of %d is %d%n", num, fact);
                } else{
                    System.out.println("Please enter a non-negative number!");
                }
            } else{
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
            }
        }
        scanner.close();
    }
}