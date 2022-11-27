class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i=1; i<A.length(); i++) {
            String str = A.substring(A.length()-i);
            String result = str + A.substring(0, A.length()-i);
            if(result.equals(B)) {
                answer = i;
            }
        }
        if(!A.equals(B) && answer == 0) {
            answer = -1;
        }
        return answer;
    }
}