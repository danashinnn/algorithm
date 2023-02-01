import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i : numbers) {
        	list1.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=1; j<numbers.length; j++) {
        		int num = list1.get(0) + list1.get(j);
        		if(!list2.contains(num)) list2.add(num);
        	}
        	list1.add(list1.get(0));
        	list1.remove(0);
        }
        Collections.sort(list2);
        return list2;
    }
}