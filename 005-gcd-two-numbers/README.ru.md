# </> 005 – Наибольший общий делитель (НОД)

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Реализуйте программу, которая вычисляет **наибольший общий делитель (НОД)** двух чисел.  
> НОД — это наибольшее число, на которое оба числа делятся **без остатка**.

---

## Файлы

### `GCD.java` (Basic)
> Простая реализация с фиксированными значениями.

```java
public class GCD {
    // Метод вычисления наибольшего общего делителя (НОД)
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
       System.out.printf("НОД чисел %d и %d равен %d.%n", num1, num2, result);
    }
}
```
### Объяснение алгоритма
1) На каждой итерации заменяем пару чисел (a, b) на (b, a % b).

2) Остаток a % b всегда строго меньше b, поэтому алгоритм постепенно уменьшает второе число.

3) Процесс продолжается, пока b не станет равно 0.
По свойству gcd(a, 0) = a, текущее значение a — это и есть наибольший общий делитель.

4) Алгоритм всегда завершается, потому что значения b строго убывают и остаются неотрицательными.

> Алгоритм основан на тождестве:
gcd(a, b) = gcd(b, a % b).

> Временная сложность — O(log(min(a, b))), что делает метод чрезвычайно эффективным.

### `GCDAdvanced.java` (Advanced)
> Продвинутая версия, демонстрирующая:

> - ввод данных с консоли,
> - проверку корректности ввода,
> - структурированный код с методом,
> - форматированный вывод результата.
```java
import java.util.Scanner;
public class GCDAdvanced{
    /**
     * Вычисляет наибольший общий делитель (НОД) двух чисел
     * с использованием алгоритма Евклида.
     *
     * @param a первое положительное число
     * @param b второе положительное число
     * @return наибольший общий делитель чисел a и b
     */
    public static int findGCD(int a, int b){
        if(a <= 0 || b <= 0){
            throw new IllegalArgumentException("Оба числа должны быть положительными.");
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
                System.out.print("Введите первое положительное число: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите второе положительное число: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                int gcd = findGCD(num1, num2);
                System.out.printf("НОД чисел %d и %d равен %d.%n", num1, num2, gcd);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целые положительные числа.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
```
---

## Вывод программы

**GCD.java**:
```
НОД чисел 36 и 60 равен 12.
```

**GCDAdvanced.java**:
```
Введите первое положительное число: 36
Введите второе положительное число: 60
НОД чисел 36 и 60 равен 12.
```

---

## Пояснение
> - GCD.java — простая версия с фиксированными значениями.
> - GCDAdvanced.java — использует алгоритм Евклида, добавляет ввод пользователя, проверку и форматированный вывод.

