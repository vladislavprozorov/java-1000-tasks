# </> 004 - Сумма чисел от 1 до N

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Напишите программу на Java, которая считывает число `N` и вычисляет сумму всех чисел от `1` до `N`.

> Эта задача помогает освоить циклы, условные проверки и ввод данных с консоли.

---

## Файлы

### `Sum.java` (Basic)
> Простая реализация с заранее заданным числом.

```java
public class Sum{
    static int summary(int num){
        int sum = 0;
        if(num < 0) {
            System.out.printf("Пожалуйста, введите целое положительное число");
            return -1;
        }
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = summary(5);
        System.out.printf("Сумма чисел от 1 до 5 равна: %d%n", result);
    }
}
```
### `SumAdvanced.java` (Advanced)
> Продвинутая версия, демонстрирующая:

> - ввод с консоли,
> - проверку корректности данных,
> - использование методов,
> - форматированный вывод.
```java
import java.util.Scanner;
public class SumAdvanced{
    /**
     * Вычисляет сумму всех целых чисел от 1 до num.
     * @param num Верхний предел (включительно) суммы.
     * @return Сумма целых чисел от 1 до num или -1, если num отрицательно.
     */
    static int summary(int num){
        int sum = 0;
        if(num < 0){
            System.out.printf("Введите положительное целое число.");
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
            System.out.print("Введите положительное целое число: ");
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input > 0){
                    int result = summary(input);
                    System.out.printf("Сумма число от %d: %d%n", input, result);
                    validInput = true;
                } else{
                    System.out.println("Неверный ввод. Введите положительное целое число.");
                }
            } else{
                    System.out.println("Неверный ввод. Введите положительное целое число.");
                    scanner.nextInt();
                }
        }
        scanner.close();
    }
}
```
---

## Вывод программы

**Sum.java**:
```
Сумма чисел от 1 до 5 равна: 15
```

**SumAdvanced.java**:
```
Введите положительное число: 7
Сумма чисел от 1 до 7 равна: 28
```

---

## Пояснение
> - Sum.java — базовая версия с фиксированным числом.
> - SumAdvanced.java — улучшенная структура с вводом, проверкой данных и переиспользуемым методом.

