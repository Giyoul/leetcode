class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> strMap = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);

            if(strMap.containsKey(sLetter)) {
                if(strMap.get(sLetter) == -1) {
                    strMap.remove(sLetter);
                } else {
                    strMap.put(sLetter, strMap.get(sLetter) + 1);
                }
            } else {
                strMap.put(sLetter, 1);
            }

            if(strMap.containsKey(tLetter)) {
                if(strMap.get(tLetter) == 1) {
                    strMap.remove(tLetter);
                } else {
                    strMap.put(tLetter, strMap.get(tLetter) - 1);
                }
            } else {
                strMap.put(tLetter, -1);
            }
        }

        if(strMap.size() == 0) {
            return true;
        }
        return false;
    }
}