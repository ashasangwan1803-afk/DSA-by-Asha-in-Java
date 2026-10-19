// QUESTION 19 --> Print all prime factors of a given number 
import java.util.*;
class Q19PrintAllPrimeFactors{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();   

        for(int div=2; div*div<=n; div++){
            while(n%div == 0){
                System.out.print(div + " ");
                n = n / div;
            }
        }
        if(n > 1){
            System.out.print(n);
        }

        
    }
}


    
