class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb =new StringBuilder(s);
        int i=0;
        int j=sb.length() -1;
        while(i < j){
            if (Character.isLetter(sb.charAt(i)) && Character.isLetter(sb.charAt(j))){
                char k = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, k);
                i++;
                j--; 
            }
            else if(Character.isLetter(sb.charAt(i)) && !Character.isLetter(sb.charAt(j))){
                j--;
            }
            else if(!Character.isLetter(sb.charAt(i)) && Character.isLetter(sb.charAt(j))){
                i++;
            }
            else if(!Character.isLetter(sb.charAt(i)) && !Character.isLetter(sb.charAt(j))){
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}