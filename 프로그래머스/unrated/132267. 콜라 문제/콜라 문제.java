class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true) {
            int cnt = n / a;
            n = n % a;
            n += b * cnt;
            answer += b * cnt;
            if (n < a) { break; }
        }
        return answer;
    }
}