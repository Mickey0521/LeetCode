public class Solution {    
    public int[] solution;
    public int[] twoSum(int[] nums, int target) {
        
      //using HashMap
        HashMap hashmap = new HashMap();
     
      //Put the number as "key", and its index as "value"
        for(int i=0; i < nums.length; i++){
            hashmap.put(nums[i], i);
        }
      
      //We are looking for another number that is equal to "target - nums[i]"
        for(int i=0; i < nums.length; i++){
            int another = target - nums[i];
            if(hashmap.containsKey(another) && (int)hashmap.get(another) !=i){
              //if we can find another_number and another_number is not itself
                int another_index;
                another_index = (int)hashmap.get(another); //get the index
                solution = new int[2]; //for the two index (solution)
                solution[0] = i;
                solution [1] = another_index;
                return solution;
            }
        }
        return nums; //no solution
    }
}
