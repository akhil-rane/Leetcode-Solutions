class Solution {
    public List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        
        String combination ="";
        
        return generateParenthesis(n*2,open,close,combination);
    }
    
    public List<String> generateParenthesis(int n,int open,int close, String combination) {
        
    		List<String> combinations = new ArrayList<>();
        
            if(n==0)
                combinations.add(combination); 
    		
        if(open>0)
        		combinations.addAll(generateParenthesis(n-1,open-1,close,combination+"("));
        
        if(close>open)
        		combinations.addAll(generateParenthesis(n-1,open,close-1,combination+")"));
        
    	return combinations;	
    }
}
