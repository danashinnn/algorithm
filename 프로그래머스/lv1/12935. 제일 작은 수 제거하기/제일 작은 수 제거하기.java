import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(arr.length == 1) {
			list.add(-1);
			return list;
		}
		
        int[] answer = arr.clone();
        Arrays.sort(answer);
        for(int i : arr) {
        	if(i != answer[0]) list.add(i);
        }
        
        return list;
    }
}