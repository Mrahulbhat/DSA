package Basic_Maths;
public class Fibonacci {
    public static int Fib(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return Fib(num-1)+Fib(num-2);
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(Fib(num));
    }
}

/*
TC = O(2^n)
SC = O(n)
 */