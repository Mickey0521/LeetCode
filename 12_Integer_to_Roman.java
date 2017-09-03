package IntegertoRoman;

class Solution {
    public String intToRoman(int num) {
        
        // store all the possible "numbers" and "strings"
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // Using "StringBuilder" (important)
        StringBuilder string_builder = new StringBuilder();
        
        // for each possible nums (from big one to small one)
        for(int i=0; i < nums.length; i++){
            // using while loop -> "num = num - nums[i]"
            // note: if "num == nums[i]" -> also "num = num - nums[i]" (be careful)
            while( num >= nums[i]){
                num = num - nums[i];
                // Using "StringBuilder.append(str)"
                string_builder.append(roman[i]); 
            }
        }
        
        return string_builder.toString(); // Using "toString()"
    }
}
