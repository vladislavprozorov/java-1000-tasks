import java.util.Scanner;
public class ReverseAdvanced {
    /**
     * Reverses the input string.
     * @param str The string to reverse.
     * @return The reversed string.
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
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.printf("Original: %s\nReversed: %s\n", input, reversed);
        scanner.close();
    }
}
