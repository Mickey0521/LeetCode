public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //Using "set" to check if characters are repeated
        Set<Character> cur_set = new HashSet<Character>();

        int max = 0; //the max length (so far)
        int i,j;
        
        //Using two loops
        for(i=0; i<s.length(); i++){ //the 1st loop
            j = i;
            while(j < s.length()){ //the 2nd loop
                if( !cur_set.contains(s.charAt(j)) ){ //a character for the first time
                    cur_set.add(s.charAt(j)); 
                    j++;
                    max = Math.max(max, cur_set.size()); //take the longest length
                }
                else{
                    cur_set.clear(); //note: clear the set (important)
                    break; //break from the 2nd loop
                }
            }
        }
        return max; //the longest length
    }
}
