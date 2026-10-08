class Solution {
    private int[] orderMap = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for(int index = 0; index < 26; index++) {
            orderMap[order.charAt(index) - 'a'] = index;
        }

        for(int index = 0; index < words.length - 1; index++) {
            if(!isOrderedBefore(words[index], words[index + 1])) {
                return false;
            }
        }

        return true;
    }

    private boolean isOrderedBefore(String currentWord, String nextWord) {
        int currentWordSize = currentWord.length();
        int nextWordSize = nextWord.length();

        for(int index = 0; index < currentWordSize && index < nextWordSize; index++) {
            if(orderMap[currentWord.charAt(index) - 'a'] > orderMap[nextWord.charAt(index) - 'a']) {
                return false;
            } else if(orderMap[currentWord.charAt(index) - 'a'] < orderMap[nextWord.charAt(index) - 'a']) {
                return true;
            } 
        }

        return currentWordSize <= nextWordSize;
    }
}