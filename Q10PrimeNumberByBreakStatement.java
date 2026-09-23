// QUESTION 10 --> Prime Number by break statement
import java.util.*;
class Q10PrimeNumberByBreakStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        int factor_count = 0;
        for(int div=1; div<=n; div++){
            if(n % div == 0){
                factor_count++;
            }
            if(factor_count > 2){
                break; // early exit
            }
        }
        if(factor_count == 2){
            System.out.println("The given number is prime number.");
        }
        else{
            System.out.println("The given number is not a prime number.");
        }
    }
}