// QUESTION 2 --> Marksheet Bot 
import java.util.*;
class Q2MarksheetBot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int marks = sc.nextInt();

        if(90 < marks){
            System.out.println("Excellent");
        }
        else if(80 <= marks){ // means marks are guaranteed less than or equal to 90 (tabhi check karenge jab (90 < marks) wali condition fail ho jayegi)
            System.out.println("Very Good");
        }
        else if(60 <= marks){
            System.out.println("Good");
        }
        else if(45 <= marks){
            System.out.println("Average");
        }
        else if(33 <= marks){
            System.out.println("You can do better");
        }
        else{
            System.out.println("Work Hard");
        }
    }
}