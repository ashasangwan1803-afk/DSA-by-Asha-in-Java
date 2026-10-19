// QUESTION 7 --> Test Case 
import java.util.*;
class Q7TestCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of testcases: ");
        int testCases = sc.nextInt();

        while(testCases > 0){
            System.out.print("enter number: ");
            int number = sc.nextInt();
            if(number % 2 == 0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
            testCases--;
            System.out.println(); // i am using this only to show code clearly by giving one line space
        }
    }
}