// Last updated: 09/07/2026, 10:06:21
class Solution {
    public int maximumWealth(int[][] arr) {
        int max = 0;
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
                sum +=arr[row][col];
            }
            
            if(sum>max){
                max = sum;
            }
            
        }
        return max;
        
        
    }
}