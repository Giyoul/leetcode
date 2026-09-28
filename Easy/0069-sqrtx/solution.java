class Solution {
    public int mySqrt(int x) {
        int head = 0;
        int tail = x;

        while(head <= tail) {
            int mid = (head + tail) / 2;
            long square = (long)mid * mid;

            if(square == x) return mid;
            if(square < x) {
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }

        return tail;
    }
}