package RomantoInteger;

class Solution {
    public int romanToInt(String s) {
        
        // new an integer array to store all the numbers
        int[] nums = new int[ s.length() ];
        
        // convert each "char" to "number"
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'M'){
                nums[i] = 1000;
            }
            if(s.charAt(i) == 'D'){
                nums[i] = 500;
            }
            if(s.charAt(i) == 'C'){
                nums[i] = 100;
            }
            if(s.charAt(i) == 'L'){
                nums[i] = 50;
            }
            if(s.charAt(i) == 'X'){
                nums[i] = 10;
            }
            if(s.charAt(i) == 'V'){
                nums[i] = 5;
            }
            if(s.charAt(i) == 'I'){
                nums[i] = 1;
            }
        }
        
        // initial setting: sum=0
        int sum =0; 
        
        // to compute the sum
        for(int j=0; j< s.length()-1 ; j++){
            // note: from bigger one to smaller one -> sum = sum + nums
            // note: if nums[j] == nums[j+1] -> sum = sum + nums (be careful)
            if(nums[j] >= nums[j+1]){
                sum = sum + nums[j];
            }
            // note: from smaller one to bigger one -> sum = sum - nums (important)
            else{
                sum = sum - nums[j];
            }
        }
        // note: the final one -> sum = sum + nums
        sum = sum + nums[ s.length()-1 ];
        
        return sum;
    }
}
