class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while(charSet.contains(c)) {
                charSet.remove(s.charAt(left++));
            }

            charSet.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}