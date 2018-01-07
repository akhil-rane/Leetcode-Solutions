class WordDictionary {
    
    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
        root.c=true;
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode current = root;
        
        for(int i=0;i<word.length();i++){
        
            char c = word.charAt(i);
            if(current.next==null) current.next = new TrieNode[26];
            if(current.next[c-'a']==null) current.next[c-'a'] = new TrieNode();
            current = current.next[c-'a'];      
        }     
        
        current.c = true;
        
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        
        return search(word,root);
    }
        
    public boolean search(String word, TrieNode current){
        
        if(current==null) return false;
        else if(word.equals("")) return current.c;
        else if (current.next==null) return false; 
        
        
        boolean isPresent = false;    
            
        if(word.charAt(0) == '.'){
            for(TrieNode node: current.next){
                isPresent=isPresent||search(word.substring(1),node);
            }
        }
        else{
            isPresent=isPresent||search(word.substring(1),current.next[word.charAt(0)-'a']);
        }
        
        return isPresent;
    }    
    
}


class TrieNode{
    
    boolean c;
    TrieNode[] next;  
    
}
