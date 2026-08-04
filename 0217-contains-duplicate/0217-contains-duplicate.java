class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isRepeat = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
                if(nums[i] == nums[i-1]){
                    isRepeat = true;
                    break;
                }
        }
        return isRepeat;
    }
}