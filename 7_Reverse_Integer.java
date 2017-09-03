package ReverseInteger;

public class Solution {
      
    public int reverse(int x) {
    
        int old_integer = x;
        long new_integer = 0; //note: using "long"
        
        //processing the digits one by one (unitil old_integer ==0)
        while(old_integer !=0){
            
            //1. take the tail (%10)
            int tail = old_integer % 10; 
            //2. add to new_integer (*10) 
            new_integer = new_integer * 10 + tail;
            //3. to next digit (/10)
            old_integer = old_integer / 10;
            
            //checking "overflows" by Integer.MAX_VALUE and Integer.MIN_VALUE
            if(new_integer > Integer.MAX_VALUE || new_integer < Integer.MIN_VALUE) 
                return 0;
        }
        
        return (int)new_integer; //note: from "long" back to "int"
    }
}
