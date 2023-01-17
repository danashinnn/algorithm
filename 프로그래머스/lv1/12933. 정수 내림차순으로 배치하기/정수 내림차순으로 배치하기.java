import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String s = "";
        for(char ch : arr) {
        	s += ch;
        }
        return Long.parseLong(new StringBuilder(s).reverse().toString());
    }
}