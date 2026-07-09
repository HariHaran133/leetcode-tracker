// Last updated: 09/07/2026, 10:06:25
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = nums[0];
        ans[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
        
    }
}