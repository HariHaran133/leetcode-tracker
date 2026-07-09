// Last updated: 09/07/2026, 10:06:28
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        boolean[] result = new boolean[n];

        int max = candies[0];

        for(int i=0;i<n;i++){
            if (candies[i]>max) {
                max = candies[i];
            }
        }

        int[] test = new int[n];

        for(int j=0;j<n;j++){
            test[j]=candies[j] + extraCandies;
        }

        for(int k=0;k<n;k++){
            if(test[k]>=max){
                result[k]=true;
            }
            else{
                result[k]=false;
            }
        }
        List<Boolean> ans = new ArrayList<>();

        for(boolean b:result){
            ans.add(b);
        }

        return ans;
        
    }
}