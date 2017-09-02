class Solution {
    
    // main idea: Expand Around Center
    // a palindrome can be "expanded" from its center
    
    // we need to keep "the max length" and "the start point of the max palindrome"
    int max_len = 0;
    int max_start =0;
    String longest_palindrome;
    
    // main function
    public String longestPalindrome(String s) {
        
        // special case
        if(s.length() == 0 || s.length() == 1)
            return s;
        
        // try to expand the palindrome from the "center"
        for(int i=0; i < s.length(); i++){
            expand(s, i, i);    // case 1: the Palindrome is with "odd" length
            expand(s, i, i+1);  // case 2: the Palindrome is with "even" length
        }
        
        // for debugging
        System.out.println(max_start);
        System.out.println(max_len);
        
        // the longest palindrome by using str.substring(int start, int end)
        longest_palindrome = s.substring(max_start, max_start + max_len);      
        
        return longest_palindrome;
    }
    
    // write a function to expand the palindrome from the "center"
    // note: the center point begins at "left" and "right"
    public void expand(String s, int left, int right){
        
        // while s.charAt(left)==s.charAt(right), then expand by "left--" and "right++"
        while(left >=0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        // note: we ill do "left--" and "right++" one more time 
        // so, the current start and end points are "left+1" and "right-1" (be careful) 
        int cur_start = left +1;
        int cur_end = right - 1;
        
        int cur_len = cur_end - cur_start + 1;
        
        // keep the max length, and the start point (for s.substring)
        if( cur_len > max_len ){
            max_len = cur_len;
            max_start = cur_start;
        }
    }
    
}
