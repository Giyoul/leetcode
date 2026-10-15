class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] costCount = new int[length];

        costCount[0] = cost[0];
        costCount[1] = cost[1];
        for(int step = 2; step < length; step++) {
            costCount[step] = Math.min(costCount[step - 1], costCount[step - 2]) + cost[step];
        }

        return Math.min(costCount[length - 2], costCount[length - 1]);
    }
}