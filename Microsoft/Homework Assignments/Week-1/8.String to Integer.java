class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if (n == 0)
            return 0;
        int sign = s.charAt(0) == '-' ? -1 : 1;
        long result = 0;
        int i = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            result = (result * 10) + (c - '0');
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int)result*sign;
    }
}
