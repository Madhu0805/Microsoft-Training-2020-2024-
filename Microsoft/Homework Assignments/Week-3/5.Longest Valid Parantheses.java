class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '('){
                stack.push(i);
            }else{
                if(!stack.isEmpty() && stack.peek() >= 0 && s.charAt(stack.peek()) == '('){
                    stack.pop();
                    int last = stack.peek(); 
                    result = Math.max(result, i - last);
                }else{
                    stack.push(i);
                }
            }
        }
        return result;
    }
}
 
