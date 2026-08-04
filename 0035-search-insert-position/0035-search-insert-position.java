class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean isFound = false;
         int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                index = i;
                isFound = true;
            }  
        }
        if(!isFound){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > target ){
                    index =i;
                    break;
                }
            }
        }
        return index;
    }
}