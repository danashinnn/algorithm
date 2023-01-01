class Solution {
    public String solution(int age) {
		String answer = "";
		char[] arr = String.valueOf(age).toCharArray();
        for(char ch : arr) {
        	answer += (char)(ch+49);
        }
        return answer;
    }
}