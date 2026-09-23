// QUESTION 10 --> Prime Number by Optimization Approach 
import java.util.*;
class Q10PrimeNumbersByOptimization{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        // this fails for n = 1 
        
        boolean isPrime = true;
        for(int div=2; div*div<=n; div++){
            if(n % div == 0){
                isPrime = false;
                break; 
            }
        }
        if(isPrime == true){
            System.out.println("The given number is prime number.");
        }
        else{
            System.out.println("The given number is not a prime number.");
        }
    }
}