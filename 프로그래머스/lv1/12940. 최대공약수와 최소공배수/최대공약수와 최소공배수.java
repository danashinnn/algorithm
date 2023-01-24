import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
		int min = Integer.min(n, m);
		int max = Integer.max(n, m);
        int[] answer = new int[2];
        while(min > 0) {
        	int tmp = max;
        	max = min;
        	min = tmp%min;
        	if(min == 0) answer[0] = max;
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}