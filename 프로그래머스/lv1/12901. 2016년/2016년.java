class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String answer = "";
        
        if(a == 1 || a == 4 || a == 7) {	// 금요일부터 시작하는 달
        	answer = days[(b+4)%7];
        } else if(a == 2 || a == 8) { 		// 월요일부터 시작하는 달 
        	answer = days[b%7];
        } else if(a == 3 || a == 11) {		// 화요일부터 시작하는 달
        	answer = days[(b+1)%7];
        } else if(a == 9 || a == 12) {		// 목요일부터 시작하는 달
			answer = days[(b+3)%7];
	    } else if(a == 5) {					// 일요일부터 시작하는 달
        	answer = days[(b+6)%7];
		} else if(a == 6) {					// 수요일부터 시작하는 달
			answer = days[(b+2)%7];
		} else if(a == 10) {				// 토요일부터 시작하는 달
			answer = days[(b+5)%7];
		}
        
        return answer;
    }
}