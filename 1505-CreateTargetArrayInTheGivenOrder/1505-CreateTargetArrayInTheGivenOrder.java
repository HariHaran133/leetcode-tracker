// Last updated: 09/07/2026, 10:06:30
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             list.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=list.get(i);
        }
       return target;
        
    }
}