class Solution {
    public char findTheDifference(String s, String t) {
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int i=0;
        int j=0;
        while (i < ch1.length) {
            if (ch1[i] != ch2[j]) {
                return ch2[j]; 
            }
            i++;
            j++;
        }
        return ch2[j];
    }
}