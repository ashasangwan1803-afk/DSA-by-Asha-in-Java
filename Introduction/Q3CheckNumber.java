// QUESTION 3 --> Check Number is +ve or -ve or zero
import java.util.*;
class Q3CheckNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input: ");
        int input = sc.nextInt();
        if (input > 0){
            System.out.println(input + " is positive number");
        }
        else if(input < 0){
            System.out.println(input + " is negative number");
        }
        else{
            System.out.println(input + " is neither positive nor negative");
        }
            
    }
}