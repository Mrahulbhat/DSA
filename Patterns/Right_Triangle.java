package Patterns;

/* using * and number

OUTPUT :
1
1 2
1 2 3
 */


public class Right_Triangle {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            int num=1; //every row must start with 1
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
// ==========================================================================
/*

    Output :
    *
    * *
    * * *

public class Right_Triangle {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/