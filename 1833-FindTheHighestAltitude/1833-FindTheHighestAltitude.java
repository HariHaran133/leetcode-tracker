// Last updated: 09/07/2026, 10:06:20
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int m = n+1;
        int[] ans = new int[n+1];
        ans[0]=0;
        ans[1]=gain[0];
        for(int i=2;i<m;i++){
            ans[i]=ans[i-1]+gain[i-1];
        }
        int max = ans[0];
        for(int j=0;j<ans.length;j++){
            if(ans[j]>max){
                max = ans[j];
            }
        }
        return max;
        
    }
}