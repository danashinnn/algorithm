import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kchar = Integer.toString(k).charAt(0);
        String str = "";
        for(int num=i; num<=j; num++) {
        	str += String.valueOf(num);
        }
        char[] charArr = str.toCharArray();
        for(int num=0; num<charArr.length; num++) {
        	if(charArr[num] == kchar) {
        		answer++;
        	}
        }
        return answer;
    }
}