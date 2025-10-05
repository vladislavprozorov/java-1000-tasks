public class Sum{
    static int summary(int num){
        int sum = 0;
        if(num < 0) {
            System.out.printf("Please enter a positive integer.");
            return -1;
        }
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = summary(5);
        System.out.printf("The sum of numbers from 1 to 5 is: %d", result);
    }
}