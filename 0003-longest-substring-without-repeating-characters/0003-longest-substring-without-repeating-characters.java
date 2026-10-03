class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int maxLen=0;
        for (int j = 0; j < s.length(); j++) {
            for (int k = j - 1; k >= i; k--) {
                if (s.charAt(j) == s.charAt(k)) {
                    i = k + 1; 
                    break;
                }
            }
             int currentLength = j - i + 1;
            if (currentLength > maxLen) {
                maxLen = currentLength;
            }
        }
        return maxLen;
    }
}