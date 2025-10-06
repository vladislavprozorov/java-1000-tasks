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