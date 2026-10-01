package Basic_Maths;

import java.util.ArrayList;

/*
Example : Input : num = 6 => Output : 1 2 6
 */

public class Factorial_upto_n {
    public static ArrayList<Integer> printFact(int num){
        ArrayList <Integer> list= new ArrayList<>();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            if(fact>num){
                break;
            }
            list.add(fact);
        }
        return list;
    }
    public static void main(String[] args) {
        int num=6;
        ArrayList <Integer> list= new ArrayList<>();
        list=printFact(num);
        System.out.println(list);
    }
}

/*
Time complexity = O(log n)
Space Complexity = O(log n)
 */