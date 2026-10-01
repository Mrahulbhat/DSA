package Sorting_Algorithms;
/*
In every iteration assign first index as min_idx
Find the element which is minimum and then swap arr[min_idx] with arr[i]
 */
public class Selection_sort {
    public static void main(String[] args) {
        int [] arr={1,4,2,3,6,5};

        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
        System.out.println("Sorted Array : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

/*
Time complexity = O(n^2) [Best case = AVG = Worst case] all have same TC AND SC
Space complexity = O(1)
 */