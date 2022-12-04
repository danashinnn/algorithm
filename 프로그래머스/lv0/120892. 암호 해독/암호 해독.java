import java.util.*;

class Solution {
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i=0; i<cipher.length(); i++) {
        	String str = "";
        	if((i+1)%code == 0) {
        		if(i != cipher.length()-1) {
        			str = cipher.substring(i, i+1);
        		} else {
        			str = cipher.substring(i);
        		}
        	}
        	answer += str;
        }
        return answer;
    }
}