import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	if(idx == 0 || idx%2 == 0) answer += Character.toUpperCase(arr[i]);
        	else answer += Character.toLowerCase(arr[i]);
        	
        	if(arr[i] == ' ') idx = 0;
        	else idx++;
        }
        return answer;
    }
}