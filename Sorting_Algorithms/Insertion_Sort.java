package Sorting_Algorithms;
public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {5,2,1,8,9,10};

        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        //Display the sorted array
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}

/*
TC : AVG CASE & WORST CASE = O(N^2) ; BEST CASE = O(N)
SC = O(1) FIXED/CONSTANT SPACE
 */