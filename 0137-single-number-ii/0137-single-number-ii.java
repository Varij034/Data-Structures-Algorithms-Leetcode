class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums){
            if(!set1.contains(num)){
                set1.add(num);
            }
            else if(!set2.contains(num)){
                set2.add(num);
            }
            else{
                set1.remove(num);
                set2.remove(num);
            }
        }
        set1.removeAll(set2);
        return set1.iterator().next();
    }
}