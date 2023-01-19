import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr) {
        	if(i%divisor == 0) list.add(i);
        }
        Collections.sort(list);;
        if(list.size() == 0) list.add(-1);
        return list;
    }
}