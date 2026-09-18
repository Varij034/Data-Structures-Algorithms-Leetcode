class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == 1) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                result[index++] = entry.getKey();
            }
        }
        return result;
    }
}