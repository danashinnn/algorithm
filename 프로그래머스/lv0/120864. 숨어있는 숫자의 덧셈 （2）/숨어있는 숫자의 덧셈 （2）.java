import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = "";
        char[] arr = (my_string + " ").toCharArray();
        for(int i=0; i<arr.length; i++) {
        	if(Character.isDigit(arr[i])) {
        		tmp += arr[i];
        	} else {
        		if(tmp != "") {
        			answer += Integer.parseInt(tmp);
        			tmp = "";        			
        		}
        	}
        }
        return answer;
    }
}