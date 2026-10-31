class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc] ;
        if(original == color){
            return image ;
        }
        floodFill1(image,sr,sc,color,original) ;
        return image ;
    }
    public int[][] floodFill1(int[][] image, int sr, int sc, int color ,int original){
        if (sr < 0 || sc < 0 || sr >= image.length ||sc >= image[0].length ||  image[sr][sc] != original ){
            return image ;
        }
        original = image[sr][sc];       
        image[sr][sc] = color;
        if(sr<image.length && sr>= 0){
            floodFill1(image,sr+1,sc,color,original);
            floodFill1(image,sr-1,sc,color,original);
        }
        if(sc<image.length && sc>=0){
            floodFill1(image,sr,sc+1,color,original);
            floodFill1(image,sr,sc-1,color,original);
        }

        return image ;
    }

}