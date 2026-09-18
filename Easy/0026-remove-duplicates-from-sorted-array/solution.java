class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!numSet.contains(nums[i])) {
                nums[index++] = nums[i];
                numSet.add(nums[i]);
            }
        }

        return index;
    }
}