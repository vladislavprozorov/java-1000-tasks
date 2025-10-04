# </> 002 - Четное или Нечетное

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Напишите программу на Java, которая читает целое число с консоли и выводит, является ли оно четным или нечетным. 

> Эта задача подходит для начинающих и демонстрирует использование условного оператора и работы с вводом пользователя.

---

## Файлы

### `Main.java` (Basic)
> Простейшее решение задачи с заранее заданным числом:

```java
class Main{
    static void evenOrOdd(int num){
        String result = num % 2 == 0 ? "Четное" : "Нечетное";
        System.out.printf("Число %d %s%n",num,result);
    }

    public static void main(String[] args){
        evenOrOdd(6);
    }
}
```
### `MainAdvanced.java` (Advanced)
> Продвинутое решение, демонстрирующее:
> - ввод с консоли,
> - обработку ошибок ввода,
> - метод для логики
> - Javadoc документацию.

```java
import java.util.Scanner;

public class MainAdvanced {
    /**
     * Определяет, является ли число четным или нечетным
     * и выводит результат.
     *
     * @param num целое число для проверки
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
                scanner.next(); // очищаем некорректный ввод
            }
        }

        scanner.close();
    }
}
```

---

## Вывод программы

**Main.java**:
```
Число 6 Четное
```

**MainAdvanced.java**:
```
Введите число: 7
Число 7 нечетное
```

---

## Пояснение
> - `Main.java` — минимальное решение, подходящее для новичков.  
> - `MainAdvanced.java` — демонстрирует более профессиональный подход: метод, проверка ввода, обработка ошибок и документация.
