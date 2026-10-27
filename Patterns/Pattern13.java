import java.util.*;
class Pattern13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int first_term = 1;
        int second_term = 1;
        int value = 1;
        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=value; i++){
                System.out.print(first_term + "\t");
                int current_term = first_term + second_term;
                first_term = second_term;
                second_term = current_term;
            }
            System.out.println();
            value++;
            current_number_of_lines++;
        }
        
    }
}