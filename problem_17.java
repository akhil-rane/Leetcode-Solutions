class Solution {
	
    public List<String> letterCombinations(String digits) {
    	
    		List<String> result = new ArrayList<>();
            
    	
    		if(digits.equals("")|digits.contains("0")||digits.contains("1")) return result; 
    	
        Map<String,List<String>> digitToLetters = new HashMap<>();
        
        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        digitToLetters.put("2",letters);
        letters = new ArrayList<>();
        letters.add("d");
        letters.add("e");
        letters.add("f");
        digitToLetters.put("3",letters);
        letters = new ArrayList<>();
        letters.add("g");
        letters.add("h");
        letters.add("i");
        digitToLetters.put("4",letters);
        letters = new ArrayList<>();
        letters.add("j");
        letters.add("k");
        letters.add("l");
        digitToLetters.put("5",letters);
        letters = new ArrayList<>();
        letters.add("m");
        letters.add("n");
        letters.add("o");
        digitToLetters.put("6",letters);
        letters = new ArrayList<>();
        letters.add("p");
        letters.add("q");
        letters.add("r");
        letters.add("s");
        digitToLetters.put("7",letters);
        letters = new ArrayList<>();
        letters.add("t");
        letters.add("u");
        letters.add("v");
        digitToLetters.put("8",letters);
        letters = new ArrayList<>();
        letters.add("w");
        letters.add("x");
        letters.add("y");
        letters.add("z");
        digitToLetters.put("9",letters);
        
        return combine(digits,digitToLetters,"");
        
    }
    
    
    public List<String> combine(String digits,Map<String,List<String>> digitToLetters,String letterCombination) {
    		
    		
		String currentDigit = digits.substring(0, 1);

		List<String> letters = digitToLetters.get(currentDigit);

		List<String> letterCombinations = new ArrayList<>();

		if(digits.length()>1)
		{	
			for(String letter: letters) {
				letterCombinations.addAll(combine(digits.substring(1),digitToLetters,letterCombination+letter));
			}
		}
		else {
			for(String letter: letters) {
				letterCombinations.add(letterCombination+letter);
			}
		}

		return letterCombinations;
    	
    }
    
}
