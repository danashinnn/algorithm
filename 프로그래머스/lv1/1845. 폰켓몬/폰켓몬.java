import java.util.*;

class Solution {
    	public int solution(int[] nums) {
		int answer = 0;
		int num = nums.length/2; // 가져가야하는 폰켓몬 종류 수
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		int cate = set.size(); // 배열 속 폰켓몬 종류 수 
		
		if(cate == num) answer = cate;
		else if(cate < num) answer = cate;
		else if(cate > num) answer = num;
		
        return answer;
    }
}