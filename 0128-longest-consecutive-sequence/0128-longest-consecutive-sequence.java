class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int longestStreak = 0;
        Set<Integer> numSet = new HashSet<>(); 
        for(int num:nums){
            numSet.add(num);
        }
        for(int n:numSet){
            if(!numSet.contains(n-1)){
                int currentNum = n;
                int currentStreak = 1;
            
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        }
        return longestStreak;
    }
}