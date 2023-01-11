import java.util.*;

class Solution {
    public String solution(String str) {
        int num1 = 0;
        int num2 = 0;
        String[] arr = str.split(" \\+ ");
        for(String s : arr) {
        	if(s.equals("x")) {
        		s = "1x";
        	}
        	if(s.contains("x")) {
        		num1 += Integer.parseInt(s.replace("x", ""));
        	} else {
        		num2 += Integer.parseInt(s);
        	}
        }
        
        String answer = "";
        if(num1 > 1) answer += num1 + "x";
        if(num1 == 1) answer += "x";
        if(num1 != 0 && num2 != 0) answer += " + ";
        if(num2 != 0) answer += num2;
        return answer;
    }
}