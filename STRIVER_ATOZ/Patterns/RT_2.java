package Patterns;
/*
OUTPUT :
1
2 2
3 3 3
 */


public class RT_2 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}