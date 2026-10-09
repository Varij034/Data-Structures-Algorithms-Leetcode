class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int [] num= new int[n];
        int i=0;
        int j=nums.length -1;
        int k=num.length -1;
        while(i <= j){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                num[k] = nums[i]*nums[i];
                k--;
                i++;
            }else{
                num[k] = nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return num;
    }
}