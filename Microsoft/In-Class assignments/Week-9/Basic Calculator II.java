
class Solution {
    public int calculate(String s) {
        int res = 0, num = 0, tmp = 0;
        char opr = '+';
        for(char chr : (s + "+").toCharArray()) {
            if(chr == ' ')continue;
            if(Character.isDigit(chr)) {
                num = num * 10 + (chr - '0');
            } else {        
                switch(opr) {
                    case '+':
                        res += tmp;
                        tmp = num;
                        break;
                    case '-':
                        res += tmp;
                        tmp = -num;
                        break;
                    case '*':
                        tmp *= num;
                        break;
                    case '/':
                        tmp /= num;
                        break;
                    default:
                        return -1;
                }
                num = 0;
                opr = chr;
            }
        }
        res += tmp;
        
        return res;
    }
}
