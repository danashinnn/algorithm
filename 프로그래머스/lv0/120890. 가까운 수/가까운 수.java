import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
        	if(array[i] <= n) {
        		continue;
        	} else {
        		int num1 = n - array[i-1];
        		int num2 = array[i] - n;
        		
        		if(num1 > num2) {
        			answer = array[i];
        			return answer;
        		} else if(num2 > num1 || num1 == num2) {
        			answer = array[i-1];
        			return answer;
        		}
        	}
        }
        answer = array[array.length-1];
        return answer;
    }
}