class Solution {
    public int strStr(String haystack, String needle) {
        

        int l = haystack.length();
        
        for(int i = 0 ; i < l ; i++) {
            if(haystack.startsWith(needle)) {
                return i;
            } else {
                haystack = haystack.substring(1, haystack.length());
            }
        }
        
        return -1;
    }
}