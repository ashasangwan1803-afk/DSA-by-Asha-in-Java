// QUESTION --> Multiplication Table using "for" loop
import java.util.*;
class Q8MultiplicationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("print table of: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}