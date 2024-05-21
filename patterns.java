public class patterns {
    public static void main(String[] args) {
        // pattern 1
        for(int i =0;i<10;i++){
            for(int j=0;j<10;j++){
                if((i==0) || (j==0) ||(i==9)||(j==9)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // pattern2 
        for(int i=0;i<4;i++){
            for(int j = 0;j<4-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //pattern 3
        for(int i=0;i<4;i++){
            for(int j = 0;j<4-i-1;j++){
                System.out.print(" ");
            }
            for(int j= 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //pattern 4
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
        //pattern 5
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
        //pattern 6
        System.out.println("");
        int count =0;
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                count++;
                System.out.print(count);
            }
            System.out.println("");
        }
        //pattern 7
        System.out.println("");
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        //pattern 8
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //pattern 9
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
                System.out.print(" ");
            }
            System.out.println("");
        }
        //pattern 10
        for(int i =0;i<5;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
             for(int j = i+1;j>0;j--){
                System.out.print(j);
             }
             for(int j = 2;j<i+2;j++){
                System.out.print(j);
             }
             System.out.println("");
        }
    }
}
