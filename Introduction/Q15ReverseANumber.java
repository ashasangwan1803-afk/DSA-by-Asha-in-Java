// QUESTION 15 --> Reverse a Number 
import java.util.*;
class Q15ReverseANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        int reversed = 0;
        while(num > 0){
            int last_digit = num % 10; // fetch last digit
            reversed = reversed*10 + last_digit; // attach last digit
            num = num/10; // remove last digit
        }
        System.out.println("Reverse of given number is: " + reversed);
    }
}