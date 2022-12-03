import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() != 1) {
            while(true) {
                String str1 = s.substring(0, 1);
                String str2 = s.substring(1);

                if(!str2.contains(str1)) {
                    answer += str1;
                }
                s = s.replace(str1, "");

                if(s.length() == 1) {
                    answer += s;
                    break;
                }
            }
            char[] charArr = answer.toCharArray();
            Arrays.sort(charArr);
            answer = new String(charArr);
        } else {
            answer = s;
        }
        
        return answer;
    }
}