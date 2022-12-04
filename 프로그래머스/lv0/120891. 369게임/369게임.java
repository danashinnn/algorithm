import java.util.*;

class Solution {
    public static int solution(int order) {
        int answer = 0;
        char[] charArr = String.valueOf(order).toCharArray();
        for(char ch : charArr) {
        	if(ch == '3' || ch == '6' || ch == '9') {
        		answer++;
        	}
        }
        return answer;
    }
}