class Solution {
    public String solution(String my_string, int n) {
        char[] arr1 = my_string.toCharArray();
        char[] arr2 = new char[arr1.length*n];
        int num = 0;
        for(char ch : arr1) {
        	for(int i=0; i<n; i++) {
        		arr2[num] = ch;
        		num++;
        	}
        }
        return String.valueOf(arr2);
    }
}