class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> mapPattern = new HashMap<>();
        
        Map<String,Character> mapString = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if(words.length != pattern.length()) {
            return false;
        }
        
        for(int i = 0 ; i < words.length ; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if(!mapPattern.containsKey(c)){
                if(mapString.containsKey(word)) {
                    return false;
                } else {
                    mapPattern.put(c,word);
                    mapString.put(word, c);
                }
            } else {
                String mapWord = mapPattern.get(c);
                if(!mapWord.equals(word)) {
                    return false;
                }
            }
        }
        return true;
    }
}