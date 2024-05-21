public class ques2 {
    public static int gcd(int a,int b){
       int num;
       if(a>b){
        num = b;
       }else{
        num = a;
       }
       while(num != 1){
         if((a%num == 0) && (b%num == 0)){
            return num;
         }else{
            num = num - 1;
         }
       }
       return 1;
    }
    public static void main(String[] args) {
        int ans = gcd(45, 30);
        System.out.println(ans);
    }
}
