import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i=0; i<strArr.length; i++) {
        	if(numbers.contains(strArr[i])) {
        		numbers = numbers.replace(strArr[i], numArr[i]);
        	}
        }
        answer = Long.parseLong(numbers);
        System.out.println(answer);
        return answer;
    }
}