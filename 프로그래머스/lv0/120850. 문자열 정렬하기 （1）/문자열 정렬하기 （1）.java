import java.util.*;

class Solution {
    public int[] solution(String my_string) {
		char[] chArr = my_string.replaceAll("[^0-9]", "").toCharArray();
		Arrays.sort(chArr);
        int[] answer = new int[chArr.length];
        for(int i=0; i<chArr.length; i++) {
        	answer[i] = Character.getNumericValue(chArr[i]);
        }
        return answer;
    }
}