class Solution {
    public boolean isHappy(int n) {
        boolean ishappy = false;
        HashSet<Integer> set = new HashSet<>();
        while(!ishappy){
            if(set.contains(n)){
            return false;
            }
            set.add(n);
            int temp = 0;
            int sum = 0;
            while (n > 0) {
                temp = n % 10;
                temp = temp * temp;
                sum = sum + temp;
                n = n / 10;
            }
            if (sum == 1) {
                ishappy = true;
            } else {
                n = sum;
            }
        }
        return ishappy;
    }
}