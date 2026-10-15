class Solution {
    public int climbStairs(int n) {
        int[] stepCount = new int[n + 1];
        stepCount[0] = 1;
        stepCount[1] = 1;

        if(n == 1) return 1;

        for(int i = 2; i <= n; i++) {
            stepCount[i] = stepCount[i-2] + stepCount[i-1];
        }

        return stepCount[n];
    }
}