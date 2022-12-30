import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        sol.solution(n);
    }
    
    public void solution(int n) {
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}