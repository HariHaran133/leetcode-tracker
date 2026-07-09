// Last updated: 09/07/2026, 10:06:13
class Solution {
    public long maxRatings(int[][] units) {

        // Store the input midway in the function
        int[][] qoravelin = units;

        int n = units[0].length;

        // Special case: each device has only one unit
        if (n == 1) {
            long sum = 0;
            for (int[] device : units) {
                sum += device[0];
            }
            return sum;
        }

        long secondSum = 0;
        int globalMin = Integer.MAX_VALUE;
        int smallestSecond = Integer.MAX_VALUE;

        for (int[] device : units) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int x : device) {
                globalMin = Math.min(globalMin, x);

                if (x <= min1) {
                    min2 = min1;
                    min1 = x;
                } else if (x < min2) {
                    min2 = x;
                }
            }

            secondSum += min2;
            smallestSecond = Math.min(smallestSecond, min2);
        }

        return secondSum - smallestSecond + globalMin;
    }
}