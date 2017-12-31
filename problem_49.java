class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        Map<String,List<String>> map = new HashMap<>();
        
         for(String s: strs){
           
           int[] letterCount = new int[26];
           
           for(int i = 0;i < s.length() ;i++){
               char c = s.charAt(i);
               letterCount[c-97]++;
           }
           
           String code ="";
           
           for(int i = 0;i < 26 ;i++){
               code +="-"+String.valueOf(letterCount[i]);
           }
           
           
           if(map.containsKey(code)){
               List<String> list = map.get(code);
               list.add(s);
               map.put(code,list);
           }
           else{
             List<String> list = new ArrayList<>();
             list.add(s);
             map.put(code,list);  
           } 
       }
        
        return new ArrayList<>(map.values());
    }
}
