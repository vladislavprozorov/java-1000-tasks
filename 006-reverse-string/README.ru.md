# </> 006 – Разворот строки

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Реализуйте программу, которая  **переворачивает строку** введённую пользователем.

Например:
```java
> Ввод: hello

> Вывод: olleh
```
---

## Файлы

### `Reverse.java` (Basic)
> Простая реализация с фиксированными значениями строки.

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
> Продвинутая версия, демонстрирующая:

> - ввод данных с консоли,
> - структурированный код с методом,
> - форматированный вывод результата.
```java
import java.util.Scanner;
public class ReverseAdvanced {
    /**
     * Переворачивает входную строку.
     * @param str Строка, которую нужно перевернуть.
     * @return Перевернутая строка.
     */
    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для переворота: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.printf("Оригинал: %s\nПеревернуто: %s\n", input, reversed);
        scanner.close();
    }
}

```
### Объяснение алгоритма
1) Строка преобразуется в массив символов:
→ это позволяет изменять символы напрямую (так как строки в Java неизменяемы).

2) Два указателя:

> - left — начало массива (0),
> - right — конец (length - 1).

3) Пока left < right:

> - меняем символы местами;
> - сдвигаем left++ и right--, двигаясь к центру.

4) Когда указатели встречаются, строка полностью перевёрнута.

Пример:
```java
hello → olleh
```

---

## Вывод программы

**Reverse.java**:
```
Оригинал: Hello, World!
Первернуто: !dlroW ,olleH
```

**ReverseAdvanced.java**:
```
Введите строку для переворота: vladislav
Оригинал: vladislav
Первернуто: valsidalv
```

---

## Пояснение
> - ReverseString.java — базовая версия, демонстрирующая логику алгоритма.
> - ReverseStringAdvanced.java — расширенная версия с пользовательским вводом и улучшенной структурой.

Используется in-place swapping, что делает метод максимально эффективным по памяти и времени.

