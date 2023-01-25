import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int idx = 0;
        int len = d.length;
        while(true) {
        	budget -= d[idx];
        	if(budget >= 0) idx++;
        	if(budget <= 0 || idx == len) break;
        }
        return idx;
    }
}