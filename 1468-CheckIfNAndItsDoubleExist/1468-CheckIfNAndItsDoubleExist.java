// Last updated: 09/07/2026, 10:06:32
class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}