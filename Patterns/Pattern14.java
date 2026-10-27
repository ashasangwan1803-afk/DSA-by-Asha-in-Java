import java.util.*;
class Pattern14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        int total_number_of_lines = 2*n+1;
        int current_number_of_lines = 1;
        int space = n;
        int star = 1;// star = value
        int start_num = 1;

        while(current_number_of_lines <= total_number_of_lines){
            for(int i=1; i<=space; i++){
                System.out.print("\t");
            }

            int num = start_num;
            for(int i=1; i<=star; i++){
                System.out.print(num + "\t");
                if(i <= star/2){
                    num++;
                }
                else{
                    num--;
                }
                
            }

            if(current_number_of_lines <= n){
                space--;
                star += 2;
                start_num++;
            }
            else{
                space++;
                star -= 2;
                start_num--;
            }
            System.out.println();
            current_number_of_lines++;
        }
    }
}