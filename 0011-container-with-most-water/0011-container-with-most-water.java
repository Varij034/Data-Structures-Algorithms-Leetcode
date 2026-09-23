class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int maximum = 0;
        while(i < j){
            int width = j-i;
            int currHeight = Math.min(height[i] , height[j]);
            int currentArea = width * currHeight;
            maximum = Math.max(maximum, currentArea);
            if(height[i] < height[j]){
                i++;
             } else{
                j--;
             }
        }
        return maximum;
    }
}