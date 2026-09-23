class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int head = 0;
        int sum = 0;

        for(int tail = 0; tail < nums.length; tail++) {
            sum += nums[tail];
            if(sum >= target) {
                while(sum >= target) {
                    minLength = Math.min(minLength, tail - head + 1);
                    sum -= nums[head++];
                }
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}