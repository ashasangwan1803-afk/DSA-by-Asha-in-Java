class operators{
    public static void main(String args[]){
        // PRE INCREMENT 
        int x = 8;
        if(x++ == 8){ // first evaluation (8==8), then increment x++ means it prints x = 9 
            System.out.println("value of x is " + x);
        }
        else{
            System.out.println("condition is false");
        }

        // POST INCREMENT 
        int y = 4;
        if(++y == 4){ // first increment y++ means it prints y = 5, then evaluation (5==4)
            System.out.println("value of y is " + y);
        }
        else{
            System.out.println("condition is false");
        }
    }
}
