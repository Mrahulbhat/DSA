/*

Input : 23
Output : 0
Explanation: Count how many digits divides the number ?
2 and 3 both don't divide 23 => 0

 */

//OPTIMAL SOLUTION

/*
TC = O(n) ie no of digits
SC = 0(1) ie fixed space
 */
package Basic_Maths;

public class Count_Digits {
    public static void main(String[] args) {
        int num = 24;
        int temp = num;
        int count = 0;

        while (temp != 0) {
            int rem = temp % 10;
            if (num % rem == 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println(count);
    }
}

// ===============================================================

// APPROACH 2: BAD APPROACH MORE Space complexity as int->str conversion + for loop etc > O(1)

// TC = O(log(n)) SC = O(log(n))

class Solution {
    static int evenlyDivides(int n) {
        String str = Integer.toString(n);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = Character.getNumericValue(ch);
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }
        return count;
    }
}