class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        int[] lastHouse = {-1, -1, -1};
        char[] arr = {'M', 'G', 'P'};

        for (int i = 0; i < garbage.length; i++) {
            for (int gType = 0; gType < 3; gType++) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == arr[gType]) {
                        count++;
                        lastHouse[gType] = i;
                    }
                }
            }
        }

        for (int gType = 0; gType < 3; gType++) {
            if (lastHouse[gType] >= 0) {
                for (int i = 0; i < lastHouse[gType]; i++) {
                    count += travel[i];
                }
            }
        }

        return count;
    }
}
