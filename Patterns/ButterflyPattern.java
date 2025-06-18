package Patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int r=4;
        int c=8;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j<=i || j>(c-i)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=c;j>=1;j--){
                if(j<=i || j>(c-i)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
