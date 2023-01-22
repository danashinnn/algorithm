import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char ch : arr) {
        	sb.append(ch);
        }
        return sb.reverse().toString();
    }
}