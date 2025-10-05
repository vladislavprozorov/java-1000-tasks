import java.util.Scanner;
public class EvenOrOdd{
    static void evenOrOdd(int num){
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.printf("Number %d is %s%n",num,result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        evenOrOdd(num);
        scanner.close();
    }
}