import java.util.*;

class Solution {
    public int solution(int[] box) {
        int[] arr = new int[box.length * box.length-1];
        int tmp = 0;
        int max = box[0] * box[1];
        for(int i=0;i<box.length;i++) {
        	for(int j=box.length-1;j>i;j--) {
        		arr[tmp] = box[i] * box[j];
        		if(arr[tmp] > max) max = arr[tmp];
        		tmp++;
        	}
        }
        return max;
    }
}