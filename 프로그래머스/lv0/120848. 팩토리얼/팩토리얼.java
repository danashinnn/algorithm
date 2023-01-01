class Solution {
    public int solution(int n) {
        int tmp = 1;
        int max = 0;
        for(int i=1; i<=11; i++) {
        	tmp *= i;
        	if(tmp > n) {
        		max = i-1;
        		break;
        	}
        }
        return max;
    }
}