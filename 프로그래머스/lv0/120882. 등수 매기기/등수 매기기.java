class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[score.length];
        int num = score.length;
        
        for(int i=0; i<score.length; i++) {
        	answer[i] = (score[i][0] + score[i][1]);        		
        }
        
        for(int i=0; i<score.length; i++) {
        	arr[i] = num;
        	for(int j=0; j<score.length; j++) {
        		if((answer[i] >= answer[j]) && i != j) {
        			arr[i] -= 1;
        		}
        	}
        }
        return arr;
    }
}