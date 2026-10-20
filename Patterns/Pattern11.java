import java.util.*;
class Pattern11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int star = 1;
        int ospaces = n/2;
        int ispaces = -1;

        while(current_number_of_lines <= total_number_of_lines){
            // print outer spaces
            for(int i=0; i<ospaces; i++){
                System.out.print("  ");
            }

            // print star
            System.out.print("* ");

            // print inner spaces 
            for(int j=0; j<ispaces; j++){
                System.out.print("  ");
            }

            // print star except cnol == 1 && cnol == n
            if(current_number_of_lines != 1 && current_number_of_lines != n){
                System.out.print("* ");
            }

            // prepare for next line
            if(current_number_of_lines <= n/2){
                ospaces--;
                ispaces += 2;
            }
            else{
                ospaces++;
                ispaces -= 2;
            }
            System.out.println();
            current_number_of_lines++;
        }
    }
}