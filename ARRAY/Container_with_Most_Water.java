/*
    There are 2 approaches
    1.Brute force
    2.Two pointer approach
*/

// Approach 1: BRUTE FORCE METHOD  TC=O(n^2) SC=O(1) -> will fail also for huge array size

class BruteForceSolution {
    public int maxArea(int[] height) {
        int max_area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                // calculate area : length*breadth
                // length is minimum height among 2 lines & breadth is x axis distance btw 2
                // lines ( j - i )
                int length = Math.min(height[i], height[j]);
                int width = j - i;
                int area = length * width;
                max_area = Math.max(max_area, area);
            }
        }
        return max_area;
    }
}

// Approach 2: OPTIMAL SOLUTION  TC = O(n) SC = O(1) ->optimal brought tc from n^2->n 

class OptimalSolution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int lp = 0, rp = height.length - 1;
        while (lp < rp) {
            int length = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int area = length * width;
            max_area = Math.max(max_area, area);

            // 2 pointer approach
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max_area;
    }
}