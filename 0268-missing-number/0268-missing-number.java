class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int index= 0;
        for (int j = 0; j < n; j++) {
            if(index == nums[j]){
                index++;
            }
        }
        return index;
    }
}