class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        for(int num : nums){
            if(!numbers.contains(num)){
                numbers.add(num);
            }
            else{
                dup.add(num);
            }
        }
        return dup;
    }
}