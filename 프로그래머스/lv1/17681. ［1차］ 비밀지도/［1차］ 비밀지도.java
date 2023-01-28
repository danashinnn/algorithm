import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
        	String str1 = Integer.toBinaryString(arr1[i]); 
        	String str2 = Integer.toBinaryString(arr2[i]); 
        	str1 = "0".repeat(n-str1.length()) + str1;
        	str2 = "0".repeat(n-str2.length()) + str2;
        	char[] chArr1 = str1.toCharArray();
        	char[] chArr2 = str2.toCharArray();
        	answer[i] = "";
        	for(int j=0; j<n; j++) {
        		if(chArr1[j] == '1' || chArr2[j] == '1') {
        			answer[i] += "#";
        		} else {
        			answer[i] += " ";
        		}
        	}
        }
        return answer;
    }
}