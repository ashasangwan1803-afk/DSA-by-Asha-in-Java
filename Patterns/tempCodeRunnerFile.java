import java.util.*;
class Pattern7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = 1;
        int spaces = 2*n-3;

        while(current_number_of_lines <= total_number_of_lines){
            // print stars
            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }

            // print spaces 
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            // print stars
            for(int k=1; k<=stars; k++){
                // if(current_number_of_lines == n && k==1){
                //     continue; 
                // }

                if(current_number_of_lines == n && k==stars){
                    break; 
                }

                System.out.print("* ");
            }

            // prepare for next line
            System.out.println();
            stars++;
            spaces -= 2;
            current_number_of_lines++;
        }
    }
}