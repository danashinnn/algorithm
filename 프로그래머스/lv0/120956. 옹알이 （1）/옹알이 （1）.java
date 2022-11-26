class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(babbling[i].equals(arr[j])) {
                    answer++;
                    break;
                }
                
                if(babbling[i].contains(arr[j])) {
                    int num1 = babbling[i].indexOf(arr[j]); 				// 첫 글자면 num1은 0
                    int num2 = arr[j].length();								// 마지막 글자면 num1+num2 = length
                    
                    if(num1 != 0 && (num1+num2 != babbling[i].length())) {  // 단어의 가운데 끼어있다면
                    	String str1 = babbling[i].substring(0, num1);
                    	String str2 = babbling[i].substring(num1+num2);
                    	if(str1.equals("aya") || str1.equals("ye") || str1.equals("woo") || str1.equals("ma") || str2.equals("aya") || str2.equals("ye") || str2.equals("woo") || str2.equals("ma")) {
                    		babbling[i] = str1 + str2;
                    	} else {
                    		babbling[i] = "";
                    	}
                    } else {
                    	babbling[i] = babbling[i].replace(arr[j], "");
                    }
                }
            }
        }
        return answer;
    }
}