import java.util.Scanner;
public class SumAdvanced{
    /**
     * Calculates the sum of all integers from 1 to num.
     * @param num The upper limit (inclusive) for the sum.
     * @return The sum of integers from 1 to num, or -1 if num is negative.
     */
    static int summary(int num){
        int sum = 0;
        if(num < 0){
            System.out.printf("Please enter a positive integer.");
            return -1;
        }
        for(int i = 1; i <= num; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            System.out.print("Enter a positive integer: ");
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input > 0){
                    int result = summary(input);
                    System.out.printf("The sum of integers from 1 to %d is: %d%n", input, result);
                    validInput = true;
                } else{
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } else{
                    System.out.println("Invalid input. Please enter a positive integer.");
                    scanner.nextInt();
                }
        }
        scanner.close();
    }
}