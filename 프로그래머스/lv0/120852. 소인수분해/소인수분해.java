import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2; i<=n; i++) {
        	while(n%i == 0) {
        		if(!list.contains(i))	list.add(i);
        		n /= i;
        	}
        }
        return list;
    }
}