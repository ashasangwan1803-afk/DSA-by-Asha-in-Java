import java.util.*;
class TernaryOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int max = x>y?x:y;
        System.out.println("max is " + max);
    }
}