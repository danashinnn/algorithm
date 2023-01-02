import java.util.*;

class Solution {
   public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];
        for(String s : keyinput) {
        	if(s.equals("left") || s.equals("right")) {
        		if(Math.abs(answer[0]) < (board[0]-1)/2) {
            		if(s.equals("left")) answer[0]--;
            		else answer[0]++;        		
            	} else if((Math.abs(answer[0]) == (board[0]-1)/2) && answer[0] < 0) {
            		if(s.equals("right")) answer[0]++;
            	} else if((Math.abs(answer[0]) == (board[0]-1)/2) && answer[0] > 0) {
            		if(s.equals("left")) answer[0]--;
            	}
        	} else {
        		if(Math.abs(answer[1]) < (board[1]-1)/2) {
            		if(s.equals("up")) answer[1]++;
            		else answer[1]--;        		
            	} else if((Math.abs(answer[1]) == (board[1]-1)/2) && answer[1] < 0) {
            		if(s.equals("up")) answer[1]++; 
            	} else if((Math.abs(answer[1]) == (board[1]-1)/2) && answer[1] > 0) {
            		if(s.equals("down")) answer[1]--; 
            	}
        	}
        }
        return answer;
    }
}