# </> </> 004 - Sum from 1 to N

[Русская версия](README.ru.md) | [English](README.md)

> **Task Description**  
> Write a Java program that reads an integer `N` and calculates the sum of all numbers from `1` to `N`.

> This task introduces basic loops, conditional checks, and console input handling.

---

## Files

### `Sum.java` (Basic)
> A simple implementation using a fixed value.

```java
public class Sum{
    static int summary(int num){
        int sum = 0;
        if(num < 0) {
            System.out.printf("Please enter a positive integer.");
            return -1;
        }
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = summary(5);
        System.out.printf("The sum of numbers from 1 to 5 is: %d", result);
    }
}

```
### `SumAdvanced.java` (Advanced)
> Advanced version with user input and input validation:

> - Improved version demonstrating:
> - console input,
> - validation,
> - method-based logic,
> - formatted output.
```java
import java.util.Scanner;
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
```
---

## Program Output Example

**Sum.java**:
```
The sum of numbers from 1 to 5 is: 15
```

**SumAdvanced.java**:
```
Enter a positive integer: 7
The sum of numbers from 1 to 7 is: 28
```

---

## Explanation
> - Sum.java — minimal version with a hardcoded number.
> - SumAdvanced.java — adds console input, validation, and better structure for reuse.

