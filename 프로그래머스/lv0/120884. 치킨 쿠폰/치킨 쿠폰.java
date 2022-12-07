class Solution {
    public static int solution(int chicken) {
        int answer = 0;
        int num = 0;
        int coupon = chicken;
        
        while(coupon > 0) {
        	answer += coupon/10; // 199 19 1 219
        	num += coupon%10; // 9 9 9 27
        	coupon /= 10;
        }
        
        if(num/10 > 0) {
        	answer += num/10;
        	num = num%10 + (num/10);
        }
        
        if((coupon+num)/10 > 0) {
        	answer += (coupon+num)/10;
        }
        
        return answer;
    }
}