import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
		int len = strings.length;
		String[] answer = new String[len];
        Arrays.sort(strings);
        for(int i=0; i<len; i++) {
        	answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);
        for(int i=0; i<len; i++) {
        	for(int j=0; j<len; j++) {
        		if(answer[i].equals(strings[j].substring(n, n+1))) {
        			answer[i] = strings[j];
        			strings[j] = " ".repeat(n+1);
        		}
        	}
        }
        return answer;
    }
}