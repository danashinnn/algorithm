import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
		int min = Integer.min(n, m);
		int max = Integer.max(n, m);
        int[] answer = new int[2];
        for(int i=min; i>0; i--) {
        	if(min%i == 0 && max%i == 0) {
        		answer[0] = i;
        		break;
        	}
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}