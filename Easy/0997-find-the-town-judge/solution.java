class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n+1];

        for(int[] trustRelation : trust) {
            trustCount[trustRelation[0]]--;
            trustCount[trustRelation[1]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(trustCount[i] == n-1) return i;
        }

        return -1;
    }
}