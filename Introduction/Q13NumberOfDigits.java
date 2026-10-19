// QUESTION 13 --> Number of digits in a given number 
import java.util.*;
class Q13NumberOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int count_digits = 0;
        while(num > 0){
            num = num / 10;
            count_digits++;
            
        }
        System.out.println("Number of digits: " + count_digits);
    }
}
// ONE MAIN PROBLEM OF THIS CODE IS THAT OUR REAL NUMBER IS LOSS