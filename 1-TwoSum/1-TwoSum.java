// Last updated: 09/07/2026, 10:06:55
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> arr = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];

            if(arr.containsKey(need)){
                return new int[]{arr.get(need),i};
            }

            arr.put(nums[i],i);
        }

        return new int[]{};
    }
}