public class Solution {
    public boolean isPalindrome(int x) {
        
        //"palindrome" means "the integer" is equal to "the reverse_integer"
        int reverse_integer = 0; 
        int temp_integer = x;
        
        //to reverse integer (loop) Step1: %10, Step2: *10, Step3: /10
        while( temp_integer !=0){
            int tail = temp_integer % 10;
            reverse_integer = reverse_integer * 10 + tail;
            temp_integer = temp_integer / 10; 
        }
        
        if(x <0)
            return false;
        else if(reverse_integer == x) //"the reverse_integer" is equal to "the integer" 
            return true;
        else
            return false;
    }
}