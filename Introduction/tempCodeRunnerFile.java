// QUESTION 17 --> Reverse a Number
import java.util.*;
class Q17RotateANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        System.out.print("enter number of rotations: ");
        int k = sc.nextInt();

        int temp = num;
        
        int length = 0;
        while(temp > 0){ // finding length of the number
            temp = temp / 10;
            length++;
        }

        k = k % length; 
        if(k < 0){
            k = k + length;
        }

        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,length-k);
        
        int last_digit = num % div;
        int front_digit = num / div;
        int rotatedNum = last_digit*mul + front_digit;
        System.out.println("rotated number: " + rotatedNum);
    }
}