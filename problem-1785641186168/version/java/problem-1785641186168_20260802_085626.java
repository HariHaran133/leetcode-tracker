// Last updated: 02/08/2026, 08:56:26
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        int n = nums.length;
4        long max = 0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                long g = gcd(nums[i],nums[j]);
8                long strength = (1L * nums[i]*nums[j])/(g*g);
9                max = Math.max(max,strength);
10            
11            }
12        }
13        return max;
14        
15        
16    }
17    private long gcd(long a,long b){
18        while (b!=0){
19            long temp =b;
20            b = a%b;
21            a = temp;
22        }
23        return a;
24    }
25}