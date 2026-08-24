class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        String [] str = s.trim().split("\\s+");
        int count = str.length;
        return count;
    }
}