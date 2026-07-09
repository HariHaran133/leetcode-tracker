// Last updated: 09/07/2026, 10:06:16
class Solution {
    public int getLength(int[] nums) {
        int[] dremovical = nums;

        int n = nums.length;
        int ans = 1;

        for (int left = 0; left < n; left++) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> freqCount = new HashMap<>();

            int distinct = 0;
            int maxFreq = 0;

            for (int right = left; right < n; right++) {

                int x = nums[right];

                int oldFreq = freq.getOrDefault(x, 0);

                if (oldFreq > 0) {
                    int c = freqCount.get(oldFreq);
                    if (c == 1) {
                        freqCount.remove(oldFreq);
                    } else {
                        freqCount.put(oldFreq, c - 1);
                    }
                } else {
                    distinct++;
                }

                int newFreq = oldFreq + 1;
                freq.put(x, newFreq);
                freqCount.put(newFreq, freqCount.getOrDefault(newFreq, 0) + 1);

                maxFreq = Math.max(maxFreq, newFreq);

                int len = right - left + 1;

                boolean balanced = false;

                if (distinct == 1) {
                    balanced = true;
                } else if ((maxFreq & 1) == 0) {

                    int half = maxFreq / 2;

                    if (freqCount.size() == 2 &&
                        freqCount.containsKey(maxFreq) &&
                        freqCount.containsKey(half) &&
                        freqCount.get(maxFreq) > 0 &&
                        freqCount.get(half) > 0 &&
                        freqCount.get(maxFreq) + freqCount.get(half) == distinct) {

                        balanced = true;
                    }
                }

                if (balanced) {
                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
        
    }
}