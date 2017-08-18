public class Solution {
    public int maxArea(int[] height) {
        
        // Using "Two Pointer" Approach
        int length = height.length; // the width
        int left = 0;               // the left pointer
        int right = length-1;       // the right pointer
        
        int max_area = 0; 
        
        while( left != right){ // move the pointers (until left==right)
            
            int area = (right - left) * Math.min(height[left], height[right]); // width * height
            
            max_area = Math.max(max_area, area); // the max area
            
            if(height[left] < height[right]) // note: move the lower one (to find bigger area)
                left++;
            else
                right--;
        }
        
        return max_area;
    }
}
