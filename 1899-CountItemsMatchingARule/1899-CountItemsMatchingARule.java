// Last updated: 09/07/2026, 10:06:19
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int n=-1;

        if(ruleKey.equals("type")) { n=0;}
        else if(ruleKey.equals("color")){ n=1;}
        else if(ruleKey.equals("name")){ n=2;}
        
        for(int r=0;r<items.size();r++){
            for(int c=0;c<items.get(r).size();c++){
                if(items.get(r).get(c).equals(ruleValue)&&c==n)
                count++;
            }    
        }
        return count;    
    }     
}