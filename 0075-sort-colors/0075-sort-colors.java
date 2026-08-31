class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp = 0;
        boolean swapped;
        for(int i=0;i<n - 1;i++){
            swapped = false;
            for(int j=0;j<n - i - 1;j++){

                if(nums[j] > nums[j+1]){

                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
            break;
        }
        }
    }
}