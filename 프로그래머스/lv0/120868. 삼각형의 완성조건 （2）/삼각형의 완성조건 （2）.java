import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1]+1;
        while(sides[0]+sides[1] > max) {
        	answer++;
        	max++;
        }
        answer += sides[0];
        return answer;
    }
}