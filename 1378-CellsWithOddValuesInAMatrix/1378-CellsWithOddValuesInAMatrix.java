// Last updated: 09/07/2026, 10:06:33
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
        

            rows[r]++;
            cols[c]++;
        }

        int oddcount = 0;
        for(int a=0;a<m;a++){
            for(int b= 0;b<n;b++){
                if((rows[a]+cols[b])%2!=0){
                    oddcount++;
                }
            }
        }



        
return oddcount;
    }
}