class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String ch = String.valueOf(k);
        if(str.contains(ch)) {
        	answer = str.indexOf(ch)+1;
        } else { 
        	answer = -1;
        }
        return answer;
    }
}