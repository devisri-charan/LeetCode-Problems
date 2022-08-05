import java.util.Arrays;

public class FloodFill{
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println(floodFill(image, sr, sc, color));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){
            return image;
        }
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private static void fill(int[][] image, int sr,int sc, int startingPixelColor, int color){
        if (0 > sr || sr >= image.length || 0 > sc || sc >= image[0].length){
            return;
        }
        if (image[sr][sc] != startingPixelColor){
            return;
        }
        image[sr][sc] = color;
        fill(image, sr-1, sc, startingPixelColor,color);
        fill(image, sr+1, sc, startingPixelColor,color);
        fill(image, sr, sc - 1, startingPixelColor,color);
        fill(image, sr, sc + 1, startingPixelColor,color);
    }   
}