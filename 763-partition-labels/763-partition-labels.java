class Solution {
    public List<Integer> partitionLabels(String s) {
        
        // Store string length
        int sLength = s.length();
        // List to store the final result
        List<Integer> result = new ArrayList<>();
        // Array to store the last position of the character in the string
        int[] lastPosition = new int[26];                    
        
        // For loop which stores the location of the character by
        // looping through each character in "s". For finding the 
        // position we will be using 'a' such that a character sub a
        // will give an number. (i.e. b-a=1) and gives the position
        // of the last index
        for(int i = 0 ; i < sLength ; i++) {
            lastPosition[s.charAt(i) - 'a'] = i;
        }
        
        int j = 0;
        int anchor = 0;
        for(int i = 0 ; i < sLength ; i++) {
            j = Math.max(j, lastPosition[s.charAt(i) - 'a']);
            if(i == j) {
                result.add(i - anchor + 1);
                anchor = i+1;
            }
        }
        
        return result;
        
    }
}