// Last updated: 02/08/2026, 09:00:51
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int n = nums.length;
4        int ans =0;
5        for(int i=0;i<n;i++){
6            int even =0;
7            int odd = 0;
8            for(int j=i;j<n;j++){
9                if(nums[j]%2==0)
10                    even++;
11                else
12                    odd++;
13
14                if(odd>0&&(long)even*b<=(long)odd*a){
15                    ans++;
16                }
17            }
18        }
19        return ans;
20        
21    }
22}