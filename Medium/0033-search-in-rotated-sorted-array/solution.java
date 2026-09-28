class Solution {
    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        while(head <= tail) {
            int mid = (head + tail) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[head] <= nums[mid]) {
                if(nums[head] <= target && target <= nums[mid]) {
                    tail = mid - 1;
                } else {
                    head = mid + 1;
                }
            } else {
                if(nums[mid] <= target && target <= nums[tail]) {
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                }
            }
        }

        return -1;
    }
}