public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static void main(String[] args) {
        
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int nearestValidPoint = -1;

        for (int i = 0; i < points.length;i++) {
            if (x == points[i][0] || y == points[i][1]){
                int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (distance < minDistance){
                    minDistance = distance;
                    nearestValidPoint = i;
                }
            }
        }
        return nearestValidPoint;
    }
}
