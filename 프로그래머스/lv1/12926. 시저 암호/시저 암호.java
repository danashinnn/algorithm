import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(char ch : arr) {
        	if(!Character.isAlphabetic(ch)) answer += ch;
        	else if((ch+n) > 122){
        		answer += (char)(ch+n-26);
        	} else if(((ch+n) > 90) && (ch > 64) && (ch < 91)) {
        		answer += (char)(ch+n-26);
        	} else {
        		answer += (char)(ch+n);
        	}
        }
        return answer;
    }
}