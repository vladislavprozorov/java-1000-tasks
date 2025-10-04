# </> 001 - Hello World

[Русская версия](README.ru.md) | [English](README.md)

> **Task description**  
> Write a Java program that prints the string `'Hello, World!'` to the console.  
> This is the most basic task that introduces the syntax of the language, program structure, and printing to the screen.

---

## Files

### `Main.java` (Basic)
> The simplest solution using `System.out.println`:

```java
public class Main{
    public static void main(String[] args)
    {
       System.out.println("Hello, World!");
    }
}
```

---

### `MainAdvanced.java` (Advanced)
> A more advanced solution demonstrating:
> - use of methods,
> - handling `null`,
> - constants,
> - output stream (`PrintStream`),
> - Javadoc documentation.

```java
import java.io.PrintStream;

public class MainAdvanced{
    private static final String HELLO_WORLD = "Hello, World!";

    /**
     * Prints a message to the given output stream with a line break.
     * @param out output stream (for example {@code System.out})
     * @param message the message to print; if {@code null}, "<empty message>" will be printed
     */
    public static void printMessage(PrintStream out, String message){
        out.printf("%s%n", message != null ? message : "<empty message>");
    }

    public static void main(String[] args)
    {
       printMessage(System.out, HELLO_WORLD);
       printMessage(System.out, "Hello, Java!");
       printMessage(System.out, null);
    }
}
```

---

## Program Output

**Main.java**:
```
Hello, World!
```

**MainAdvanced.java**:
```
Hello, World!
Hello, Java!
<empty message>
```

---

## Explanation
> - `Main.java` — the minimal solution, good for beginners.  
> - `MainAdvanced.java` — demonstrates a more professional approach: using methods, constants, output streams, and handling potential errors (`null`).  
> - This approach makes the code scalable and easily extendable for more complex tasks.
