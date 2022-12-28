class Solution {
    public int[] solution(int[] num_list) {
        int num1 = 0;
        int num2 = 0;
        for(int num : num_list) {
            if(num%2 == 0) num1++;
            else num2++;
        }
        return new int[] {num1, num2};
    }
}