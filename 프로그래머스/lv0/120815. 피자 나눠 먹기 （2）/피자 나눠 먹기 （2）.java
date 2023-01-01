class Solution {
    public int solution(int n) {
        int tmp = 6;
        int answer = 0;
        while(true) {
        	if(tmp%n == 0 && tmp%6 == 0) {
        		answer = tmp/6;
        		break;
        	} else {
        		tmp++;
        	}
        }
		return answer;
    }
}