
import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        int positive = 0;
        int negative =0;
        int zero = 0;
        int n;
        do{
            Scanner sc =  new Scanner(System.in);
            n = sc.nextInt();
            if(n > 0){
                positive++;
            }else if(n<0){
                negative++;
            }else{
                zero++;
            }
        }while(n != -1000);
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
