class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()){
            if (sb.length() > 0 && ch == sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}