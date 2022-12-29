import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		if(n > 2) {
			for(int i=3; i<n+1; i++) {
				if(i%2 == 1) list.add(i);
			}
		}
		return list;
    }
}