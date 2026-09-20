// QUESTION 1 --> Input 3 integers given by user, find average and print average
import java.util.*;
class Q1AverageOfIntegers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("enter 3rd number: ");
        int num3 = sc.nextInt();

        double avg = (num1 + num2 + num3)/3.0;
        System.out.println("Average of numbers: " + avg);
    }

}