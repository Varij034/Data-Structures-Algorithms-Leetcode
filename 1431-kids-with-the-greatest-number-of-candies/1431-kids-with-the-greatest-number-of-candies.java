class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=0;
        for(int n: candies){
            if(n > max){
                max = n;
            }
        }
        for(int i:candies){
            if((i + extraCandies) >= max){
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}