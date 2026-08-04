class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            System.out.println("Empty");
        }int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                count++;
            }
        }
        int size = nums.length-count;
        int [] expectedNums = new int [size];
        int index = 0;
        for(int i = 0 ;i < nums.length;i++){
            if(nums[i] != val){
                expectedNums[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < expectedNums.length; i++) {
            nums[i] = expectedNums[i];
        }
        int newsize= expectedNums.length;
        expectedNums = Arrays.stream(expectedNums).sorted().toArray();
        System.out.println(Arrays.toString(expectedNums));
        return newsize;
    }
}