import java.util.*;
class Pattern15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int spaces = 2*n-3;
        int stars = 1;
    
        
        while(current_number_of_lines <= total_number_of_lines){
            int num = 1;
            for(int i=1; i<=stars; i++){
                System.out.print(num + " ");
                num++;
            }
            num--;

            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            if(current_number_of_lines == total_number_of_lines){
                stars--;
                num--;
            }
            for(int i=1; i<=stars; i++){
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
            spaces -= 2;
            stars ++;
            current_number_of_lines++;
        }
    }
}