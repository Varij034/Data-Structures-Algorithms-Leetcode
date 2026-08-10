class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                result.add(n);
            }
        }
        int [] arr = result.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}