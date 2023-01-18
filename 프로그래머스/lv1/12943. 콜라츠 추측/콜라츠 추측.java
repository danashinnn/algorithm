class Solution {
    public int solution(int num) {
        int cnt = 0;
        long n = num;
        while(true) {
        	if (n == 1){
        		break;
        	}else if(n%2 == 0) {
        		n /= 2;
        		cnt++;
        	} else {
        		n = n * 3 + 1;
        		cnt++;
        	}
        	
        	if(cnt == 500) return -1;
        }
        return cnt;
    }
}