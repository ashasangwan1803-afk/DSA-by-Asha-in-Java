// QUESTION 16 --> Inverse a Number
import java.util.*;
class Q16InverseOfANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        int position = 1;
        int inverse = 0;
        while(num > 0){
            int last_digit = num%10;
            // inverse += position*Math.pow(10,last_digit-1);
            inverse = inverse + position*(int)Math.pow(10,last_digit-1);
            num = num/10;
            position++;
        }
        System.out.println("Inverse of given number is " + inverse);
    }
}