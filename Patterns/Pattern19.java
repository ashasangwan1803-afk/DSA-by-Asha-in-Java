import java.util.*;
class Pattern19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = n/2+1;
        int spaces = 1;
        int num = 1;

        while(current_number_of_lines <= total_number_of_lines){
            int start_num = num;
            for(int i=1; i<=stars; i++){
                System.out.print(start_num + " ");
                start_num++;
            }
            start_num--;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int i=1; i<=stars; i++){
                System.out.print(start_num + " ");
                start_num--;
            }
            if(current_number_of_lines <= n/2){
                stars--;
                spaces += 2;
                num++;
            }
            else{
                stars++;
                spaces -= 2;
                num--;
            }
            System.out.println();
            current_number_of_lines++;
        }

    }
}