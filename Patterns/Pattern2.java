import java.util.*;
class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = n;
        int spaces = 0;

        while(current_number_of_lines <= total_number_of_lines){
            // print spaces 
            for(int i=1; i<=spaces; i++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces++;
            stars--;
            current_number_of_lines++;
        }
    }
}