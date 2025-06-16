package Patterns;

public class InvertedHalfPyramid180D {
    public static void main(String[] args) {
        int n=4;
        for (int i =1;i<=n;i++){
            for(int j=n;j>=i;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
