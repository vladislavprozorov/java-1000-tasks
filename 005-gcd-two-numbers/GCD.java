public class GCD {
    // Method for calculating the greatest common divisor (GCD)
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        int result = gcd(num1, num2);
        System.out.printf("The GCD of %d and %d is %d.%n", num1, num2, result);
    }
}
