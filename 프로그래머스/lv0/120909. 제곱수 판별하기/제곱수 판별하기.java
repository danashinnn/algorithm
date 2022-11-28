class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i=0; i<1000; i++) {
            num++;
            if(num * num == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}