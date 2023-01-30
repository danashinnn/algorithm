import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<commands.length; i++) {
        	int a = commands[i][0];
        	int b = commands[i][1];
        	for(int j=a; j<=b; j++) {
        		list.add(array[j-1]);
        	}
        	Collections.sort(list);
        	answer[i] = list.get(commands[i][2]-1);
        	list.clear();
        }
        return answer;
    }
}