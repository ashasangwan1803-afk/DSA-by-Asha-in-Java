import java.util.*;
class TernaryOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int max = x>y?x:y;
        System.out.println("max is " + max);

        System.out.print("enter number: ");
        int n = sc.nextInt();
        String result = (n%2==0)? "even" : "odd";
        System.out.println(result);
    }
}