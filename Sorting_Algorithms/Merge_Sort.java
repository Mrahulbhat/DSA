package Sorting_Algorithms;
public class Merge_Sort {
    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void Merge(int [] arr, int low, int mid, int high){
        int [] temp = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=high){
            temp[k++]=arr[j++];
        }
        // now copy elements from temp array to org array

        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void MergeSort(int [] arr,int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int [] arr = {32,27,43,3,9,82,10};
        MergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}

/*
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/