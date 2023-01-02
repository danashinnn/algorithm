import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int tmp = 0;
        String[] arr = s.split(" ");
        for(String str : arr) {
        	if(!str.equals("Z")) {
        		answer += Integer.parseInt(str);
        		tmp = Integer.parseInt(str);
        	} else {
        		answer -= tmp;
        	}
        }
        return answer;
    }
}