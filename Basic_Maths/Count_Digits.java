/*

Input : 23
Output : 0
Explanation: Count how many digits divides the number ?
2 and 3 both don't divide 23 => 0

 */

package Basic_Maths;
public class Count_Digits {
    public static void main(String[] args) {
        int num=24;
        int temp=num;
        int count=0;

        while(temp!=0){
            int rem=temp%10;
            if(num%rem==0){
                count++;
            }
            temp=temp/10;
        }
        System.out.println(count);
    }
}

/*
TC = O(n) ie no of digits
SC = 0(1) ie fixed space
 */
