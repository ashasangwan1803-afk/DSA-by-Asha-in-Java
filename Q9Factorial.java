// QUESTION 9 --> Factorial 
import java.util.*;
class Q9Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int res = 1;
        long res = 1; // if hamare result ki value -ve aane lag gyi toh hum iska use karenge 

        for(int fact=n; fact>=1; fact--){
            res = res*fact;
            
        }
        System.out.println(n + " factorial is: " + res);
    }
}