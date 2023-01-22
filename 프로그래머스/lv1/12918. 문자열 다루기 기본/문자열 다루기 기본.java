import java.util.*;

class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        char[] arr = s.toCharArray();
        for(char ch : arr) {
        	if(!Character.isDigit(ch)) return false;
        }
        return true;
    }
}