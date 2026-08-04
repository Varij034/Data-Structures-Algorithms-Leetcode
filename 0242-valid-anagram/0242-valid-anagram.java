class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray1);
        boolean isAnagram = false;
        int i =0;
        int j =0;
        
        if(charArray.length != charArray1.length){
            isAnagram = false;
        }
        else{
        while(i <= charArray.length -1 && j <= charArray1.length-1)
        {
            if(charArray[i] == charArray1[j]){
                i++;
                j++;
                isAnagram = true;
            }
            else{
                isAnagram = false;
                break;
            }
        }
        }
        return isAnagram;
    }
}