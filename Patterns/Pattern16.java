import java.util.*;
class Pattern16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int total_number_of_lines = n; 
        int current_number_of_lines = 1;
        int stars = n;
        int spaces = 0;

        while(current_number_of_lines <= total_number_of_lines){

            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            for(int i=1; i<=stars; i++){
                if(current_number_of_lines != 1 && current_number_of_lines <= n/2 && i>1 && i<stars){ // and instead of i>1 we use i!=1 && i<stars we use i!=stars
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }

            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            if(current_number_of_lines <= n/2){
                stars  -= 2;
                spaces++;
            }
            else{
                stars += 2;
                spaces--;
            }
            System.out.println();
            current_number_of_lines++;
        }

        
    }
}