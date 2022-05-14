class Solution {
    public boolean isAnagram(String s, String t) {
        
        int s1 = s.length();
        int t1 = t.length();
        
        // Converting to array
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();
        
        if(s1 != t1) {
            return false;
        } else {
            
            Arrays.sort(s2);
            Arrays.sort(t2);
            
            for(int i = 0 ; i < s1 ; i++) {
                System.out.println(s2[i]);
               if(s2[i] != t2[i]) {
                   return false;
               } 
            }
            return true;
        }
    }
}