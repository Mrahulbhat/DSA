/*
INPUT : NUM = 4
OUTPUT = 15

HOW? => SUM OF DIVISORS OF 4,3,2,1 => (4+2+1) + (3+1) + (2+1) + 1  = 15
 */

package Basic_Maths;
public class Sum_of_all_divisors {
    public static int sumOfAllDivisors(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
                sum=sum+i*(num/i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int num=4;
        int sum=sumOfAllDivisors(num);
        System.out.println(sum);
    }
}

