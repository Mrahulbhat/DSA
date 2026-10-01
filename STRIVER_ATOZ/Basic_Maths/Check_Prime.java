package Basic_Maths;
public class Check_Prime {
    public static boolean checkPrime(int num){
        for(int i=2;i*i<=num;i++){
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num=4;
        System.out.println(checkPrime(num));
    }
}

/*
TC = O(sqrt(n))
SC = O(1)
 */