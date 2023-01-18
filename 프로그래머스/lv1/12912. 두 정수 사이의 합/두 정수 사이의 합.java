class Solution {
    public long solution(int a, int b) {
        int al = Integer.min(a, b);
        int bl = Integer.max(a, b);
        long answer = al;
        while(al != bl) {
        	al++;
        	answer += al;
        }
        return answer;
    }
}