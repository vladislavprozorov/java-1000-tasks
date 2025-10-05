public class Factorial {
    public static long factorial(long num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        int num = 5;
        long result = factorial(num);
        System.out.printf("Factorial of %d is %d%n", 5, result);
    }
}
