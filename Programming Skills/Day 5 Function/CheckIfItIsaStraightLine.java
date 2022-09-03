public class CheckIfItIsaStraightLine {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
                             // 0 1   0 1
                             //  0     1         
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        
        for (int[] point : coordinates) {
            int x = point[0];
            int y = point[1];
            if (dx * (y - coordinates[1][1]) != dy * (x - coordinates[1][0])){
                return false;
            }
        }
        return true;
    }
}
