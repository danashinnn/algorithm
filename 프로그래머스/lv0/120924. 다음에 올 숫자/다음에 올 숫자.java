class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = common[1]-common[0];
        
        if(num == common[2]-common[1]) {    // 등차수열이라면
            answer = (common.length * num) + common[0];
        } else {                            // 등비수열이라면
            num = common[1]/common[0];
            answer = common[common.length-1] * num;
        }
        return answer;
    }
}