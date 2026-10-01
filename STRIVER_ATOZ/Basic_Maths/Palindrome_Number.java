/*
Explanation :
Example 1 :
Input 1 : number = 121 ; reverse = 121 => Palindrome
Input 2 : number = -121 ; reverse = 121- => Not Palindrome
 */


package Basic_Maths;
public class Palindrome_Number {
    /*
    Approach 1 - Not Optimal:

    public static boolean checkPalindromeNumber(int num){
        if(num<0){
            return false; //neg number cannot be a palindrome
        }
        else{
            StringBuilder sb=new StringBuilder(Integer.toString(num)); //convert num to string ; find reverse
            return (sb.reverse().toString().equals(Integer.toString(num))); // return if rev equals org number
        }
    }
Time Complexity : O(n)
Space Complexity : O(n) //there exists a better solution below
 */


    // APPROACH 2 - OPTIMAL
    public static boolean checkPalindromeNumber(int num) {
        if(num<0){
            return false;
        }
        int rev=0;
        int temp=num;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev==num;
    }

    public static void main(String[] args) {
        int num=-121;
        System.out.println(checkPalindromeNumber(num));
    }
}

/*
Time Complexity : O(n)
Space Complexity : O(1) //fixed
 */


