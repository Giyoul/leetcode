class Solution {
    public String simplifyPath(String path) {
        String[] splitedPath = path.split("/");
        Deque<String> st = new ArrayDeque<>();
        
        for(String s : splitedPath){
            if(s.equals("") || s.equals(".")) continue;
            if(s.equals("..")){
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append("/" + st.removeLast());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}