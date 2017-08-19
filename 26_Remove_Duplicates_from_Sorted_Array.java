public class Solution {
    public int removeDuplicates(int[] nums) {
        
        // we need to return "the new length" and need to "modify the given array"
        // note 1: it doesn't matter what you leave beyond the new length (simple)
        // note 2: the array has been sorted (so only need one pass)
        
        // special case
        if(nums.length ==0)
            return 0;
        
        int index = nums[0]; // the value that we need to compare with
        int count = 1;       // the initial length
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] != index){ // a different value appears
                index = nums[i];  // change the value that we need to compare with
                nums[count]=index; // modify the given array
                count++;           // the new length++
            }
            // skip the case: nums[i] == index
        }
        return count; // return the new length
    }
}
