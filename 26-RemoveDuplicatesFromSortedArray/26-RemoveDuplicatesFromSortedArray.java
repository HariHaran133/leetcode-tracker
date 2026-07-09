// Last updated: 09/07/2026, 10:06:53
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count = 1;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                count++;
                nums[slow]=nums[fast];
            }

        }

        return count;
        
    }
}