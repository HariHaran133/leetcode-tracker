// Last updated: 09/07/2026, 10:06:17
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            int index = ch - 'a';

            if (!visited[index]) {
                visited[index] = true;
                count++;
            }
        
        
        }
    return count == 26;
    }


}