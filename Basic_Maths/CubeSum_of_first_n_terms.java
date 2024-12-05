package Basic_Maths;
/*
Input : 5
Output= 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 1+8+27+64+125=225
 */

public class CubeSum_of_first_n_terms {
    public static int sumofn(int num){
        if(num<0){
            return 0;
        }
        return num*num*num+ sumofn(num-1);
    }
    public static void main(String[] args) {
        int num=5;
        int sum=sumofn(num);
        System.out.println(sum);
    }
}