class Solution {
    public int reverse(int x) {
        char[] digits = Integer.toString(x).toCharArray();
        int i = (digits[0] == '-') ? 1 : 0;
        int j = digits.length - 1;
            while(i<=j){
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                i++;
                j--;
            }
        long rev = Long.parseLong(new String(digits));
        return safeReturn(rev);
    }
    public int safeReturn(long rev) {
    if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}