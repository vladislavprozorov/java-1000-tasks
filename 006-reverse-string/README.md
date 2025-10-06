# </> 006 – Reverse a String

[Русская версия](README.ru.md) | [English](README.md)

> **Task description**  
> Write a program that **reverses a string** entered by the user.

Example:
```java
> Input: hello

> Output: olleh
```
---

## Files

### `Reverse.java` (Basic)
> Simple implementation with a fixed string.

```java
public class Reverse{
    static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.printf("Original: %s\nReversed: %s\n", original, reversed);
    }
}
```

### `ReverseAdvanced.java` (Advanced)
> An advanced version demonstrating:

> - console input,
> - structured code with a method,
> - formatted output.
```java
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class ReverseAdvanced {
   public ReverseAdvanced() {
   }

   public static String reverseString(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = 0;

      for(int var3 = var1.length - 1; var2 < var3; --var3) {
         char var4 = var1[var2];
         var1[var2] = var1[var3];
         var1[var3] = var4;
         ++var2;
      }

      return new String(var1);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a string to reverse: ");
      String var2 = var1.nextLine();
      String var3 = reverseString(var2);
      System.out.printf("Original: %s\nReversed: %s\n", var2, var3);
      var1.close();
   }
}
```
### Algorithm Explanation
1) Convert the input string into a character array
→ because Java String objects are immutable (cannot be modified directly).

2) Use two pointers:

> - left points to the beginning (0)
> - right points to the end (length - 1)

3) While left < right:

> - Swap the characters at these positions
> - Move the pointers toward each other (left++, right--)

4) When the pointers meet, the array is fully reversed.
Convert it back to a String and print the result.

Example:
```java
hello → olleh
```

---

## Program Output Example

**Reverse.java**:
```
Original: Hello, World!
Reversed: !dlroW ,olleH
```

**ReverseAdvanced.java**:
```
Enter a string to reverse: vladislav
Original: vladislav
Reversed: valsidalv
```

---

## Explanation
> - ReverseString.java — basic version that demonstrates the core idea.
> - ReverseStringAdvanced.java — adds user input and proper structure.

The algorithm uses in-place character swapping, making it both time- and space-efficient.

