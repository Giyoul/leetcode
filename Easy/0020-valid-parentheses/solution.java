class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if(charStack.isEmpty()) {
                charStack.push(s.charAt(i));
                continue;
            }
            
            if(charStack.peek() == '(' && s.charAt(i) == ')') {
                charStack.pop();    
            } else if (charStack.peek() == '{' && s.charAt(i) == '}'){
                charStack.pop();    
            }  else if (charStack.peek() == '[' && s.charAt(i) == ']'){
                charStack.pop();    
            } else {
                charStack.push(s.charAt(i));
            }
        }

        return charStack.isEmpty();
    }
}