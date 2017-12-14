class Solution {
    public int firstUniqChar(String s) {
        int[] dict = new int[26];
        
        for (int i = 0; i < s.length(); i++)  dict[s.charAt(i)-97]++;
        
        for (int i = 0; i < s.length(); i++) { 
            if (dict[s.charAt(i)-97] == 1) return i;
        }
        
        return -1;
    }
}