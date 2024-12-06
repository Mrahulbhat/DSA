package Basic_Maths;
/*
Input : s = " A man, a plan, a canal, a panama "
Output : True
 */

public class Valid_palindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal, panama";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)) { //to remove blank and comma
                sb.append(Character.toLowerCase(ch));
            }
        }
        String filteredString=sb.toString();
        String reverse=sb.reverse().toString();
        System.out.println(reverse);
        System.out.println(reverse.equals(filteredString));
    }
}

/*
TC = O(n)
SC = O(n)
 */
