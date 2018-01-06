class Trie {

    private TrieNode root;
    
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        root.c=true;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
        TrieNode current = root;
        
        for(int i=0;i<word.length();i++){
        
            char c = word.charAt(i);
            if(current.next==null) current.next = new TrieNode[26];
            if(current.next[c-'a']==null) current.next[c-'a'] = new TrieNode();
            current = current.next[c-'a'];      
        }     
        
        current.c = true;
        
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        
        
        TrieNode current = root;
        
        for(int i=0;i<word.length();i++){
        
            char c = word.charAt(i);
            //System.out.println(c);
            if(current.next==null) return false;
            else if(current.next[c-'a']==null) return false;
            
            current = current.next[c-'a'];
        
        }
            
        return current.c;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        
        for(int i=0;i<prefix.length();i++){
        
            char c = prefix.charAt(i);
            if(current.next==null) return false;
            else if(current.next[c-'a']==null) return false;
            
            current = current.next[c-'a'];
        
        }
        
        return true;
    }
}

class TrieNode{
    
    boolean c;
    TrieNode[] next;  
    
}
