class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> symbols = new HashMap<>();
        symbols.put('I',1);
        symbols.put('V',5);
        symbols.put('X',10);
        symbols.put('L',50);
        symbols.put('C',100);
        symbols.put('D',500);
        symbols.put('M',1000);
        
        int result = symbols.get(s.charAt(s.length()-1));
        
        for(int i = s.length()-2 ; i >= 0 ; i--) {
            
            if(symbols.get(s.charAt(i)) < symbols.get(s.charAt(i+1))) {
                result -= symbols.get(s.charAt(i));
            } else {
                result += symbols.get(s.charAt(i));
            }
        }
        return result;
    }
}