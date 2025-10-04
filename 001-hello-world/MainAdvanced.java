package task001;
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