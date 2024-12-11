package Basic_Maths;
public class Print_Prime_upto_N {
    public static void main(String[] args) {
        int num=15;
        for(int i=2;i<=num;i++)//start from 2 coz 0 and 1 are not prime num
        {
            int flag=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*
Brute force method
TC = O(n^2) * O(sqrt(n)) => O(n ^ 3/2) ; since outer for loop = O(n) but inner for loop checks only upto sqrt(i)
SC = O(1) ; fixed space
 */