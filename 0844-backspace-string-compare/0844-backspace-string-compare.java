class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                sb1.append(ch);
            }else if(!Character.isLetter(ch) && sb1.length()==0){
                continue;
            }else{
                sb1.deleteCharAt(sb1.length() - 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (Character.isLetter(ch)) {
                sb2.append(ch);
            }
            else if (!Character.isLetter(ch) && sb2.length()==0){
                continue;
            }else{
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}