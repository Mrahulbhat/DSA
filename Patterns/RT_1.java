package Patterns;
/*
OUTPUT :
1
1 2
1 2 3
 */


public class RT_1 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            int num=1; //every row must start with 1
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++; // increment number every column
            }
            System.out.println();
        }
    }
}