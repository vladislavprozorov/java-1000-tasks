# </> 003 - Факториал (итеративно)

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Реализуйте программу на Java, которая читает число и выводит его факториал, используя **итеративный** подход (цикл).

---

## Файлы

### `Factorial.java` (Basic)
> Простейшее решение задачи с заранее заданным числом:

```java
public class Factorial {
    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.printf("Факториал числа %d равен %d%n", number, factorial(number));
    }
}
```
### `FactorialAdvanced.java` (Advanced)
> Продвинутая версия с вводом числа и проверкой корректности

```java
import java.util.Scanner;
public class FactorialAdvanced{
    /**
     * Вычисляет факториал неотрицательного целого числа итеративно.
     * @param num число для расчета факториала
     * @return факториал of {@code num}
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
            System.out.print("Введите неотрицательное число: ");
            if(scanner.hasNextLong()){
                long num = scanner.nextLong();
                if(num >= 0){
                    long fact = factorial(num);
                    validInput = true;
                    System.out.printf("Факториал числа %d равен %d%n", num, fact);
                } else{
                    System.out.println("Введите неотрицательное число");
                }
            } else{
                System.out.println("Ошибка ввода! Введите целое число.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
```
---

## Вывод программы

**Factorial.java**:
```
Факториал числа 5 равен 120
```

**FactorialAdvanced.java**:
```
Введите неотрицательное число: 6
Факториал числа 6 равен 720
```

---

## Пояснение
> - Используется итеративный подход (через цикл for), а не рекурсия.
> - Подходит для чисел до ~20, так как тип long ограничен.
> - Рекомендуется использовать для тренировки циклов и арифметики.

