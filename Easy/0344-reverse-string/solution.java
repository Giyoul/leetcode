class Solution {
    public void reverseString(char[] s) {
        int head = 0;
        int tail = s.length - 1;

        while(head < tail) {
            char tmp = s[tail];
            s[tail--] = s[head];
            s[head++] = tmp;
        }
    }
}