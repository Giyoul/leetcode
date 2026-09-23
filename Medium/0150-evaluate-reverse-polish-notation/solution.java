class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> dq = new ArrayDeque<>();

        for(String token : tokens) {
            if(token.equals("+")) {
                dq.addLast(dq.removeLast() + dq.removeLast());
            } else if(token.equals("-")) {
                int by = dq.removeLast();
                int target = dq.removeLast();
                dq.addLast(target - by);
            } else if(token.equals("*")) {
                dq.addLast(dq.removeLast() * dq.removeLast());
            } else if(token.equals("/")) {
                int by = dq.removeLast();
                int target = dq.removeLast();
                dq.addLast(target / by);
            } else {
                dq.addLast(Integer.parseInt(token));
            }
        }

        return dq.removeFirst();
    }
}