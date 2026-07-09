// Last updated: 09/07/2026, 10:06:24
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (nums[i]==nums[j])
                count++;
            }
        }
        return count;

        
    }
}