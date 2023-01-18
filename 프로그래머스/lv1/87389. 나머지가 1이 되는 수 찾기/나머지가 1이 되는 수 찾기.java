class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n-1; i>1; i--) {
        	if(i > 1 && (n-1)%i == 0) answer = i;
        }
        if(answer == 0) answer = n-1;
        return answer;
    }
}