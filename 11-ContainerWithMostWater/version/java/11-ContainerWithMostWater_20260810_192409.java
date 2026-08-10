// Last updated: 10/08/2026, 19:24:09
1class Solution {
2    public int maxArea(int[] height) {
3        int n = height.length-1;
4        int l = 0;
5        int r = n;
6        int max = 0;
7        while(l<r){
8            int width = r-l;
9            int h = Math.min(height[l],height[r]);
10            int water = width*h;
11            max = Math.max(water,max);
12            if(height[l]<height[r]){
13                l++;
14            }
15            else{
16                r--;
17            }
18
19        }
20        return max;
21    }
22}