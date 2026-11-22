class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ispow = false;
        if(n==1){
            return true;
        }
        long pro =1;
        for(long i=1;i<n;i++){
            pro *= 2;
            if(pro==n){
                return true;
            }
            else if(pro > n){
                return false;
            }

        }
        return ispow;
    }
}