class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbfinal = new StringBuilder();
        int i = 0;
        int iteration = 1;
        while(i < s.length()){
            sb.setLength(0);
            int end = Math.min(i + k, s.length());
            if(iteration % 2 !=0){
                for(int j = i ; j < end; j++){
                    sb.append(s.charAt(j));
                }
                sb.reverse();
                sbfinal.append(sb);
            }
            else{
                for(int j = i ; j < end ; j++){
                    sbfinal.append(s.charAt(j));
                }
            }
            i = end;
            iteration++;
        }
        return sbfinal.toString();
    }
}