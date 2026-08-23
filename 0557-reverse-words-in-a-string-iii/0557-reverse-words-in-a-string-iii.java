class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbfinal = new StringBuilder();
        String [] words = s.split(" ");
        int i = 0;
        while(i < words.length){

            sb.append(words[i]);
            int left = 0;
            int right = sb.length() - 1;

            while (left < right) {
                char temp = sb.charAt(left);

                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }

            sbfinal.append(sb);
            sbfinal.append(" ");
            sb.setLength(0);
            i++;
        }
        return sbfinal.toString().trim();
    }
}