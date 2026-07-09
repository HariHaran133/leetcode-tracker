// Last updated: 09/07/2026, 10:06:39
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for(int fast = 0;fast<nums.length;fast++){

            if(nums[fast]!=0){
            int temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
            slow++;
            }
        }
        
    }
}