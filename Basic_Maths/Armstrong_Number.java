package Basic_Maths;
public class Armstrong_Number{
    public static boolean checkArmstrong(int num){
        int temp=num;
        int digits=Integer.toString(num).length();
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+(int)Math.pow(rem,digits);
            temp=temp/10;
        }
        return num==sum;
    }
    public static void main(String[] args) {
        int num=153;
        System.out.println(checkArmstrong(num));
    }
}

/*
TC = O(n)
SC = O(1)
 */