class Solution {
    public boolean isPalindrome(String s) {
        int i =0;
        int j =s.length() -1;
        s=s.toLowerCase();
        while(i <= j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }else if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}