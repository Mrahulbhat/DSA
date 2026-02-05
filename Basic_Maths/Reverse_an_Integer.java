package Basic_Maths;

/*
Example 1 :
Input : 123 ; Output : 321

Example 2 :
Input : -123 Output : -321

======================

THERE ARE 2 APPROACHES TO SOLVE THIS PROBLEM
1. StringBuilder approach - TC: O(n) & SC: O(n) 
2. Mathematical approach - OPTIMAL SOLUTION - TC: O(n) & SC: O(1)
*/

//method 1 ( not optimal solution as it uses extra space for string conversion and string builder etc )
public class Reverse_an_Integer {
    public static int calc_reverse(int num){
        int start_idx=0;
        StringBuilder reverse=new StringBuilder();
        if(num<0){
            reverse.append("-");
            start_idx=1;
        }
        String num_str=Integer.toString(num);
        for(int i=num_str.length()-1;i>=start_idx;i--){
            reverse.append(num_str.charAt(i));
        }
        try{
            return Integer.parseInt(reverse.toString());
        }
        catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        int num=-123;
        int reverse=calc_reverse(num);
        System.out.println("Reverse is "+ reverse);
    }
}

//method 2 ( optimal solution ) TC = O(n), SC = O(1) as we are using only a constant amount of space to store the reversed integer and temporary variables.
class Solution {
    public int reverse(int x) {
        long rev = 0; // using long as alternative to try catch block as Java int overflow does not throw exceptions so try catch block will not work here

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int) rev;
    }
}

