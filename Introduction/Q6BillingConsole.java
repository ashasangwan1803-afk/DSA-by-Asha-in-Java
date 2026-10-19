// QUESTION --> Billing Console with 18% gst
import java.util.*;
class Q6BillingConsole{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost of 1st Object: ");
        double object1 = sc.nextDouble();

        System.out.print("enter cost of 2nd Object: ");
        double object2 = sc.nextDouble();

        System.out.print("enter cost of 3rd Object: ");
        double object3 = sc.nextDouble();

        double total = (object1 + object2 + object3);
        System.out.println("Total: " + total);

        // 18% gst
        double gst = total*0.18;
        System.out.println("total gst: " + gst);

        double total_bill = total + gst;
        System.out.println("total with gst: " + total_bill);
    }
}