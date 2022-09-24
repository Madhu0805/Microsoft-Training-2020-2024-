class Solution {
       int[] stairs = new int[46];
    public int climbStairs(int n) {
	
        if(n < 0 ){
          return 0;
        }if(n == 0){
          return 1;
        }if(stairs[n] != 0){
          return stairs[n];
        }
        return stairs[n] = climbStairs(n-1) + climbStairs(n-2);

    }
}
