class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char[] charS = s.toCharArray();

        int head = 0;
        int tail = s.length() - 1;
        while(head <= tail) {
            while(!Character.isLetterOrDigit(charS[head]) && head < s.length() - 1) {
                head++;
            }
            while(!Character.isLetterOrDigit(charS[tail]) && tail > 0) {
                tail--;
            }
            if(head <= tail && Character.toLowerCase(charS[head]) != Character.toLowerCase(charS[tail])) {
                return false;
            }
            head++;
            tail--;
        }

        return true;
    }
}