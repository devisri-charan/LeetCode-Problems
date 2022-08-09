import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int[] heights1 = {5,1,2,3,4};
        int[] heights2 = {1,2,3,4,5};
        System.out.println(heightChecker(heights));
        System.out.println(heightChecker(heights1));
        System.out.println(heightChecker(heights2));
    }

    public static int heightChecker(int[] heights) {
        int wrongOrder = 0;
        int n = heights.length;
        int[] expectedHeights = heights.clone();
        Arrays.sort(expectedHeights);

        for (int i = 0; i < n; i++) {
            if (heights[i] != expectedHeights[i]){
                wrongOrder++;
            }
        }
        return wrongOrder;
    }
}
