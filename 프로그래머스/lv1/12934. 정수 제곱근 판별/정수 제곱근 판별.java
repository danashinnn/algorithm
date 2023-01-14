class Solution {
    public long solution(long n) {
        long answer = 0;
        while(answer * answer <= n) {
        	if(answer * answer == n) {
        		return (answer+1) * (answer+1);
        	} else if(answer * answer < n) {
        		answer++;
        	}
        }
        return -1;
    }
}