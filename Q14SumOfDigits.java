// QUESTION 14 --> Sum of digits in a given number
import java.util.*;
class Q14SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        int n = num;
        int sum = 0;
        while(n > 0){
            int last_digit = n % 10;
            sum = sum + last_digit;
            n = n / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}