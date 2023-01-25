import java.util.*;

class Solution {
    public int solution(int n) {
        String str = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        int answer = Integer.parseInt(str, 3);
        return answer;
    }
}