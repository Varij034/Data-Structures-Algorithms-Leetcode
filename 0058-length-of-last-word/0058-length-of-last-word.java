class Solution {
    public int lengthOfLastWord(String s) {
        String [] s1 = s.split(" ");
        String last = s1[s1.length - 1];
        int len = last.length();
        return len;
    }
}