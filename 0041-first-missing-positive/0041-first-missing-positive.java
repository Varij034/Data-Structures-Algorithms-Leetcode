class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int corrInd = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[corrInd]){
                int temp=nums[i];
                nums[i]=nums[corrInd];
                nums[corrInd]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}