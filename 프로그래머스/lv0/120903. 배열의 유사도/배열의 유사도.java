import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<String>(Arrays.asList(s1));
        
        for(int i=0; i<s2.length; i++) {
            if(list.contains(s2[i])) {
                answer++;
            }
        }
        return answer;
    }
}