class Solution {
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        // if(nums[tail] < target) return tail + 1;

        while(head <= tail) {
            int mid = (head + tail) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                head = mid + 1;
            } else { 
                tail = mid - 1;
            }
        }

        return head;
    }
}