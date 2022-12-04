import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(char ch : charArr) {
        	if('a' <= ch && ch <= 'z') {
        		answer += String.valueOf(ch).toUpperCase();
        	} else {
        		answer += String.valueOf(ch).toLowerCase();
        	}
        }
        System.out.println(answer);
        return answer;
    }
}