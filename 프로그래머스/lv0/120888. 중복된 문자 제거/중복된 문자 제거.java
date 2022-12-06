class Solution {
    public String solution(String my_string) {
        String answer = "";
        if(my_string.length() != 1) {
        	int i = 1;
        	while(true) {
        		String str1 = my_string.substring(0, i);
        		String str2 = my_string.substring(i);
        		
        		if(str2.contains(str1.substring(str1.length()-1))) {
        			my_string = str1 + str2.replaceAll(str1.substring(str1.length()-1), "");
        		}
        		if(i == my_string.length()) {
        			break;
        		}
        		i++;
        	}
        }
        answer = my_string;
        return answer;
    }
}