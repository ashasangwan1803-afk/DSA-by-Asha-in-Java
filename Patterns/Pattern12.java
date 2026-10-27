import java.util.*;
class Pattern12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int num = 1;
        int value = 1;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=value; i++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
            value++;
            current_number_of_lines++;
        }
    }
}