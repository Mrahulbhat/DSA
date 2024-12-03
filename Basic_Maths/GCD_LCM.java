package Basic_Maths;

/*
LOGIC : LCM = a * b / GCD (a,b)

/*
APPROACH 1 : NOT OPTIMAL BUT EASY TO UNDERSTAND
public class GCD_LCM {
    public static int calcGCD(int a,int b){
        int ans=1;
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static int calcLCM(int a,int b){
        int gcd=calcGCD(a,b);
        return (a*b)/gcd;
    }
    public static void main(String[] args) {
        int a=8,b=12;
        int lcm=calcLCM(a,b);
        System.out.println(lcm);
    }
}

 */

//OPTIMAL APPROACH - EUCLIDEAN METHOD

public class GCD_LCM {
    public static int calcGCD(int a,int b){
        if(b==0){
            return a;
        }
        return calcGCD(b,a%b);
    }
    public static int calcLCM(int a,int b){
        int gcd=calcGCD(a,b);
        return (a*b)/gcd;
    }
    public static void main(String[] args) {
        int a=8,b=12;
        int lcm=calcLCM(a,b);
        System.out.println(lcm);
    }
}
/*
time complexity of O(log(min(a,b))).
space complexity is same as time complexity
 */

