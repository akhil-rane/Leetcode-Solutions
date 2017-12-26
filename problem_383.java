class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] dict = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
			dict[magazine.charAt(i)-97]++;
		}
        
        for (int i = 0; i < ransomNote.length(); i++) {
			if (dict[ransomNote.charAt(i)-97] == 0) return false;
			else dict[ransomNote.charAt(i)-97]--;
		}
        return true;
    }
}
