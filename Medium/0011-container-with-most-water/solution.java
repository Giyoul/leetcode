class Solution {
    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int max = 0;

        while(head < tail) {
            if(height[head] < height[tail]) {
                max = Math.max(max, (tail - head) * height[head]);
                head++;
            } else {
                max = Math.max(max, (tail - head) * height[tail]);
                tail--;
            }
        }

        return max;
    }
}