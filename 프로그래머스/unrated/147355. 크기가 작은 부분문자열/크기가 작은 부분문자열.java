class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        Long pnum = Long.parseLong(p);
        
        for(int i=0; i<t.length()-plen+1; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j=i; j<i+plen; j++) {
        		sb.append(t.charAt(j));
        	}
        	Long num = Long.parseLong(sb.toString());
        	if(pnum >= num) answer++;
        }
    	
        return answer;
    }
}