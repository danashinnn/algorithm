class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int tmp = num2 - num1 + 1;
        int[] answer = new int[tmp];
        for(int i=0; i<tmp; i++) {
        	answer[i] = numbers[num1];
        	num1++;
        }
        return answer;
    }
}