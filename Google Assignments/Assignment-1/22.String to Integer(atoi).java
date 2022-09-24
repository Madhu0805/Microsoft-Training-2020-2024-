
class Solution {
    public int myAtoi(String s) {
        int n = 0;
        int res = 0;
        int sign = 1;
        if (s.length() == 0){
            return 0;
        }
        
        while (n < s.length() && s.charAt(n) == ' '){
            n++;
        } 
        if (n < s.length() && (s.charAt(n) == '+' || s.charAt(n) == '-')){
            sign = (s.charAt(n++) == '-') ? -1 : 1;
        }
    
        while (n < s.length() && s.charAt(n) >= '0' && s.charAt(n) <= '9'){
            
            if (res > Integer.MAX_VALUE / 10 ||
                (res == Integer.MAX_VALUE / 10 && s.charAt(n) - '0' > Integer.MAX_VALUE % 10))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            res = res * 10 + (s.charAt(n++) - '0');
        }
        
        return res * sign;
    }
}
