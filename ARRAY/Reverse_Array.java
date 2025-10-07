  /*
        Note: Reverse the same array
        Approach 1 : - (avg) We will create a temp array, reverse it and store back into original array
        Approach 2 : - (optimal) Divide the array into half and swap from front and back.
  */

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        // Optimal approach : divide array into half and swap

        for(int i=0;i<n/2;i++){
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        //Display the array
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

/*
    Time Complexity = O(N) since we are using a single for loop
    Space Complexity = O(1) coz we are using fixed space to store
 */