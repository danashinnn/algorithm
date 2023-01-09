import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int[] arrX = new int[4];
        int[] arrY = new int[4];
        for(int i=0; i<4; i++) {
        	arrY[i] = dots[i][0];
        	arrX[i] = dots[i][1];
        }
        
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        
        return Math.abs(arrX[3]-arrX[0]) * Math.abs(arrY[3]-arrY[0]);
    }
}