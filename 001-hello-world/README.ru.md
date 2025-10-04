# </> 001 - Hello World

[Русская версия](README.ru.md) | [English](README.md)

> **Описание задачи**  
> Напишите программу на Java, которая выводит строку `'Hello, World!'` в консоль.  
> Эта задача является базовой и знакомит с синтаксисом языка, структурой программы и выводом информации на экран.

---

## Файлы

### `Main.java` (Basic)
> Простейшее решение задачи с использованием `System.out.println`:

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
> Продвинутое решение, демонстрирующее:
> - использование методов,
> - обработку `null`,
> - константы,
> - поток вывода (`PrintStream`),
> - Javadoc документацию.

```java
import java.io.PrintStream;

public class MainAdvanced{
    private static final String HELLO_WORLD = "Hello, World!";

    /**
     * Печатает сообщение в заданный поток вывода с переносом строки.
     * @param out поток вывода (например {@code System.out})
     * @param message сообщение для печати; если {@code null}, будет выведено "<пустое сообщение>"
     */
    public static void printMessage(PrintStream out, String message){
        out.printf("%s%n", message != null ? message : "<пустое сообщение>");
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

## Вывод программы

**Main.java**:
```
Hello, World!
```

**MainAdvanced.java**:
```
Hello, World!
Hello, Java!
<пустое сообщение>
```

---

## Пояснение
> - `Main.java` — минимальное решение, подходящее для новичков.  
> - `MainAdvanced.java` — демонстрирует более профессиональный подход: использование методов, констант, потоков вывода и обработку возможных ошибок (`null`).  
> - Такой подход делает код масштабируемым и легко расширяемым для более сложных задач.