class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        s = s.replace("-","");
        s = s.toUpperCase();
        
        int count = 0;
        
        StringBuffer sb = new StringBuffer(s);
        
        for(int i = s.length()-1 ; i > 0 ; i--) {
            count++;
            if(count == k) {
                sb.insert(i,"-");
                count = 0;
            }
        }
        
        return sb.toString();
    }
}