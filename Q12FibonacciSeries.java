// QUESTION 12 --> Fibonacci Series
import java.util.*;
class Q12FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter which nth term of fibonacci series you want: ");
        int n = sc.nextInt();

        int Second_Last_Term = 0; // 1st term
        int Last_Term = 1; // 2nd term

        for(int i=1; i<=n-2; i++){
            int Current_Term = Last_Term + Second_Last_Term;
            // 3rd term = 1st term + 2nd term

            Second_Last_Term = Last_Term;
            Last_Term = Current_Term;
        }
        System.out.println("nth term of fibonacci series is: " + Last_Term);
    }
}