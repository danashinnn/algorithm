class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        hp = hp%5;
        while(hp != 0) {
        	if(hp >= 3) {
        		answer += hp/3;
        		hp = hp%3;
        	} else {
        		answer += hp;
        		break;
        	}
        }
        return answer;
    }
}