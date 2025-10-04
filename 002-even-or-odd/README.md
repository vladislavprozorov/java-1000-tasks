# </> 002 - Even or Odd

[Русская версия](README.ru.md) | [English](README.md)

> **Task Description**  
> Create a Java program that reads an integer from the console and prints whether it is even or odd.  

> This task is suitable for beginners and demonstrates the use of conditional statements and user input.

---

## Files

### `Main.java` (Basic)
> Basic solution with a predefined number:

```java
class Main{
    static void evenOrOdd(int num){
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.printf("Number %d is %s%n",num,result);
    }

    public static void main(String[] args){
        evenOrOdd(6);
    }
}
```
### `MainAdvanced.java` (Advanced)
> Advanced solution demonstrating:
> - console input,
> - input validation,
> - method for logic,
> - Javadoc documentation.

```java
import java.util.Scanner;

public class MainAdvanced {
    /**
     * Determines if a number is even or odd and prints the result.
     *
     * @param num integer to check
     */
    public static void evenOrOdd(int num) {
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.printf("Number %d is %s%n", num, result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                evenOrOdd(num);
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // clear invalid input
            }
        }

        scanner.close();
    }
}

```

---

## Program Output Example

**Main.java**:
```
Number 6 is Even
```

**MainAdvanced.java**:
```
Enter an integer: 7
Number 7 is Odd
```

---

## Explanation
> - `Main.java` — minimal solution suitable for beginners.
> - `MainAdvanced.java` — demonstrates a professional approach: method, input validation, error handling, and documentation.
