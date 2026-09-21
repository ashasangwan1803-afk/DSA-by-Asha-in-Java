class precedence{
    public static void main(String args[]){
        int x = 2;
        int y = 5;
        int a = (y*(x/y+x/y));
        int b = (y*x/y+y*x/y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int X = 9, Y = 12;
        int A = 2, B = 4, C = 6;
        int exp = 4/3*(X+34)+9*(A+B*C)+(3+Y*(2+A))/(A+B*Y);
        System.out.println("exp = "+ exp);
    }
}