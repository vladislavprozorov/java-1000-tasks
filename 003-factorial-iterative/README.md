# </> 003 - Factorial (Iterative)

[Русская версия](README.ru.md) | [English](README.md)

> **Task Description**  
> Implement a Java program that reads a number and prints its factorial using an **iterative** approach (loop).

---

## Files

### `Factorial.java` (Basic)
> Basic solution with a predefined number:

```java
public class Factorial {
    public static long factorial(long num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        int num = 5;
        long result = factorial(num);
        System.out.printf("Factorial of %d is %d%n", 5, result);
    }
}

```
### `FactorialAdvanced.java` (Advanced)
> Advanced version with user input and input validation:
```java
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
```
---

## Program Output Example

**Factorial.java**:
```
Factorial of 5 is 120
```

**FactorialAdvanced.java**:
```
Enter a non-negative integer: 6
Factorial of 6 is 720
```

---

## Explanation
> - Uses an iterative approach (via a for loop) rather than recursion.
> - Works for numbers up to ~20 due to long overflow.
> - Useful for practicing loops and arithmetic operations.
