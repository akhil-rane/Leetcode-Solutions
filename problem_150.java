class Solution {
    public int evalRPN(String[] tokens) {
        
    		Stack<Integer> stack = new Stack<>();
    		
    		for (int i = 0; i < tokens.length; i++) {
    			
    			String token = tokens[i];
    			
    			if(!(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))) {
    				stack.push(Integer.parseInt(token));
    			}
    			else if(token.equals("+")){
    				stack.push(stack.pop()+stack.pop());
    			}
    			else if(token.equals("-")){
    				int temp = stack.pop();
    				stack.push(stack.pop()+temp);
    			}
    			else if(token.equals("*")){
    				stack.push(stack.pop()*stack.pop());
    			}
    			else {
    				int temp = stack.pop();
    				stack.push(stack.pop()/temp);
    			}
		}
    		
    		return stack.pop();
    }
}
