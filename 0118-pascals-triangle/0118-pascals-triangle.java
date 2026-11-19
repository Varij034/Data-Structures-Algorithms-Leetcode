class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            long value = 1;

            for (int j = 0; j <= i; j++) {
                currentRow.add((int) value);
                value = value * (i - j) / (j + 1);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}