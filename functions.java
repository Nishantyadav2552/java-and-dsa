public class functions {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
public static void main(String[] args) {
        int n = factorial(4);
        int m = factorial(5);
        System.out.println(n==m);
        

    }
}

