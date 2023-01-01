class Solution {
    public String solution(String letter) {
		String answer = "";
        String[] arr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
        	    "--.","....","..",".---","-.-",".-..",
        	    "--","-.","---",".--.","--.-",".-.",
        	    "...","-","..-","...-",".--","-..-",
        	    "-.--","--.."};
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<morse.length; j++) {
        		if(arr[i].equals(morse[j])) {
        			arr[i] = (char)(j+97)+"";
        			break;
        		}
        	}
        }
        for(String str : arr) {
        	answer += str;
        }
        return answer;
    }
}