package Basic_Maths;

/*
Example 1 :
Input : 123 ; Output : 321

Example 2 :
Input : -123 Output : -321
*/

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

/*
TC = O(n)
SC = O(n)
 */

