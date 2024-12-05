package Sorting_Algorithms;
/*
logic : Total iterations=n-1
Bubble first element in first iteration
Check if next element is lesser than bubbled element ?
If yes => Swap
Else : shift bubble to next and repeat until end
 */

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr= {4,2,7,1,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){ //total iterations : n-1
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

/*

Time complexity = BEST CASE = O(n) coz no swaps for already sorted arrays ;
AVG CASE & WORST CASE = O(n^2)

Space complexity = O(1) // fixed space

 */