class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(char ch : rsp.toCharArray()) {
        	answer += (ch=='2') ? "0" : (ch=='0') ? "5" : "2";
        }
        return answer;
    }
}