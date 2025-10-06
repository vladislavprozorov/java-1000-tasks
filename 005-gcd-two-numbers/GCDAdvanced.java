import java.util.Scanner;
public class GCDAdvanced{
    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a first positive integer
     * @param b second positive integer
     * @return greatest common divisor of a and b
     */
    public static int findGCD(int a, int b){
        if(a <= 0 || b <= 0){
            throw new IllegalArgumentException("Both numbers must be positive integers.");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            try {
                System.out.print("Enter the first positive integer: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the second positive integer: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                int gcd = findGCD(num1, num2);
                System.out.printf("The GCD of %d and %d is %d.%n", num1, num2, gcd);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter positive integers.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}