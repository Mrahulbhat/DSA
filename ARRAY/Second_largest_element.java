/*
Optimal Solution - easy - without sorting : Don't do sorting and finding second largest from back.
You are simply wasting more time (TC) by sorting entire array and then finding it
 */

public class Second_largest_element {
    public static int second_largest(int [] arr){
        if(arr.length<2){
            return -1; // min 2 values are req to have second largest element
        }
        int max=Integer.MIN_VALUE;
        int second_max=max;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max ){
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]<max){
                second_max=arr[i];
            }
        }
        if(second_max!=Integer.MIN_VALUE){
            return second_max; // used to check as arrays can have all same elements
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,6,3,6,5,4,5};
        System.out.println(second_largest(arr));
    }
}

/* Using Sorting : Easy but not Optimal TC = O(logn)

import java.util.Arrays;

public class Second_largest_element {
    public static int second_largest(int [] arr){
        if(arr.length<2)//minimum 2 ele required to find second largest
        {
            return -1;
        }
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]<largest){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,6,3,6,5,4,5};
        System.out.println(second_largest(arr));
    }
}
 */