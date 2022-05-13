class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            
            if(c == '(' || c == '{' || c=='[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            }
            
            else {
                
                if(c == ')' && stack.peek() != '('){
                    break;
                } else if(c == '}' && stack.peek() != '{'){
                    break;
                } else if(c == ']' && stack.peek() != '['){
                    break;
                } else {
                    stack.pop();
                }
            }
            
            
        }
        
        return stack.isEmpty();
    }
}