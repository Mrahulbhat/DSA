package ARRAY;
public class Largest_Element_in_Array {
    public static int find_largest_element(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,6,4,9,3,7,3};
        int max_element=find_largest_element(arr);
        System.out.println(max_element);
    }
}

// Time complexity = O(n)
// Space complexity = O(1)
