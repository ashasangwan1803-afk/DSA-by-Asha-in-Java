// QUESTION 18 --> LCM and HCF (GCD) of a Given Number
import java.util.*;
class Q18HcfLcm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("enter 2nd number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while(a > 0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        int hcf = b; // hcf = gcd
        System.out.println("hcf is: " + hcf);

        int lcm = (num1*num2)/hcf;
        System.out.println("LCM is: " + lcm);

        // for knowledge --> lcm*gcd = num1*num2;

    }
}