package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //Special case
        if(strs.length == 0)   
           return "";
        
        //Initial
        Boolean prefix_match = false;
        String prefix = strs[0];
        
        //note: we will shorten the common prefix if not perfectly match
        //Using Horizontal Scanning 
        for(int i=1; i< strs.length; i++){ //from the 1st string to the last string
            while( prefix_match == false){
                if(strs[i].indexOf(prefix) ==0) { //match: using string.indexOf(string)==0
                    prefix_match = true;
                }                
                else{
                    prefix = prefix.substring(0, prefix.length()-1); //shorten prefix: using string.substring(0, length-1)
                }
            }
            prefix_match = false;
        }        
        
        return prefix;
    }
}
