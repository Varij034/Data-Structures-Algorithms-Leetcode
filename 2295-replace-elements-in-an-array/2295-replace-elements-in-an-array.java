class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        for (int[] op : operations) {
            int oldVal = op[0];
            int newVal = op[1];
            int idx = indexMap.get(oldVal);
            nums[idx] = newVal;
            indexMap.remove(oldVal);
            indexMap.put(newVal, idx);
        }
        return nums;
    }
}