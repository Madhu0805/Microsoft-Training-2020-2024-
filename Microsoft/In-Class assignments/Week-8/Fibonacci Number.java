
class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
		
        int last = 1;
        int secondLast = 0;
        
        for(int i = 2; i <= n; i++){
            int sum = last + secondLast;
            
            secondLast = last;
            last = sum;
        }
        
        return last;
    }
}
