package Basic_Maths;
public class Fibonacci_upto_N {
    public static void main(String[] args) {
        int num=10;
        int a=0,b=1;
        System.out.print(a+" "); //to print 1st Fib number

        for(int i=1;i<=num;i++){
            System.out.print(b+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}

/*
TC = O(N)
SC = O(1) CONSTANT SPACE
 */