import java.util.Arrays;
import java.util.*;

// using 2 approaches
// BRUTE FORCE -> TC: O(N^2) SC: O(1)
// OPTIMAL SOLUTION USING HASHMAP : TC: O(N) SC:O(N) 
//=> hashmap may end up taking more space in worst case but has better time complexity.

//Optimal Solution TC=O(N) SC=O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (result.containsKey(complement)) { 
                return new int[] { result.get(complement),i };
            }
            result.put(nums[i],i);
        }
        return new int[] {};
    }
}

public class Two_Sum {
    public static void main(String args[]) {
        int[] nums = { 2, 7, 3, 6, 11, 15 };
        int target = 9;

        Solution s = new Solution();

        int[] result = new int[2];
        result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

// Basic Approach:
// TC = O(N^2) SC=O(1)
// class Solution {
// public int[] twoSum(int[] nums, int target) {
// for(int i=0;i<nums.length;i++){
// for(int j=i+1;j<nums.length;j++){
// if(nums[i]+nums[j]==target){
// return new int[]{i,j}; // return array of solution
// }
// }
// }
// return new int [] {}; //return empty array if no match
// }
// }
