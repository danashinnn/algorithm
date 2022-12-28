import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char ch : my_string.toCharArray()) {
            sb.append((ch + "").repeat(n));
        }
        return sb.toString();
    }
}