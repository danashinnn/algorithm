class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = 0;
        int num2 = x;
        while(num2 > 0) {
        	num += num2%10;
        	num2 /= 10;
        }
        if(x%(num+num2) == 0) answer = true;
        return answer;
    }
}