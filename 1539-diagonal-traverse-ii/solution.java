class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        // Using a HashMap to store elements in diagonal groups
        Map<Integer, List<Integer>> diagonalGroups = new HashMap<>();
        int totalElements = 0;

        // Iterate through the input matrix in a reverse diagonal pattern
        for (int r = nums.size() - 1; r >= 0; r--) {
            for (int c = 0; c < nums.get(r).size(); c++) {
                int diagonal = r + c;

                // If diagonal index not present, create a new list
                if (!diagonalGroups.containsKey(diagonal)) {
                    diagonalGroups.put(diagonal, new ArrayList<>());
                }

                // Add the element to the respective diagonal group
                diagonalGroups.get(diagonal).add(nums.get(r).get(c));
                totalElements++;
            }
        }

        // Prepare the resulting array
        int[] result = new int[totalElements];
        int index = 0;
        int currentDiagonal = 0;

        // Retrieve elements from diagonal groups and store them in the result array
        while (diagonalGroups.containsKey(currentDiagonal)) {
            for (int num : diagonalGroups.get(currentDiagonal)) {
                result[index++] = num;
            }
            currentDiagonal++;
        }

        return result;
    }
}
