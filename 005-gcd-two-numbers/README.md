# </> 005 – Greatest Common Divisor (GCD)

[Русская версия](README.ru.md) | [English](README.md)

> **Task Description**  
> Implement a program that calculates the **Greatest Common Divisor (GCD)** of two integers.  
The GCD is the largest integer that divides both numbers without leaving a remainder.

---

## Files

### `GCD.java` (Basic)
> A simple implementation using a fixed value.

```java
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

```
### `GCDAdvanced.java` (Advanced)
> Advanced version with user input and input validation:

> - Improved version demonstrating:
> - console input,
> - input validation,
> -method-based logic,
> - formatted output.
```java
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
```
---

## Program Output Example

**GCD.java**:
```
The GCD of 36 and 60 is 12.
```

**GCDAdvanced.java**:
```
Enter the first positive integer: 36
Enter the second positive integer: 60
The GCD of 36 and 60 is 12.
```

---

## Explanation
> - GCD.java — simple version with fixed numbers.
> - GCDAdvanced.java — uses the Euclidean algorithm, adds user input, validation, and formatted output.

