class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int n1 : nums1){
            list1.add(n1);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int n2 : nums2){
            if(list1.contains(n2)){
                list2.add(n2);
                list1.remove(Integer.valueOf(n2));
            }
        }
        int [] arr = list2.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}