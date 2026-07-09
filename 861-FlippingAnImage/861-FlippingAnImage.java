// Last updated: 09/07/2026, 10:06:36
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int r=0;r<image.length;r++){
            int start = 0;
            int end = image[r].length-1;
            while(start<end){
                int temp = image[r][start];
                image[r][start] = image[r][end];
                image[r][end] = temp;
                start++;
                end--;
            }
            for(int c=0;c<image[r].length;c++){
                if(image[r][c]==0){image[r][c]=1;}
                else{image[r][c]=0;}
            }

                
        }
        

            
        
        
        return image;
        
    }
}