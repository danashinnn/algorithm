class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        int i = 0;
        long num = x;
        while(true) {
        	answer[i] = num;
        	num += x;
        	i++;
        	if(i == n) break;
        }
        return answer;
    }
}