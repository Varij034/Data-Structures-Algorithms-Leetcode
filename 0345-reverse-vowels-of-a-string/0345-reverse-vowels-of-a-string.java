class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j= s.length() -1;
        char[] chars = s.toCharArray();
        while(i <= j){   
        if (isVowel(chars[i]) && isVowel(chars[j])) { 
            char temp = chars[i]; 
            chars[i] = chars[j]; 
            chars[j] = temp;
            i++;
            j--;
        }
        else if(isVowel(chars[i]) && !isVowel(chars[j])){
            j--;
        }
        else if(!isVowel(chars[i]) && isVowel(chars[j])){
            i++;
        }
        else if(!isVowel(chars[i]) && !isVowel(chars[j])){
            i++;
            j--;
        }
    }
    return new String(chars);
}

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static boolean isVowel(char ch) {
        for (char v : VOWELS) {
            if (ch == v) {
                return true; 
            }
        }
        return false;
    }
}