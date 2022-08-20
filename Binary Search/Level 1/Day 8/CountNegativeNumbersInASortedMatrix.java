public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-21},{-1,-1,-2,-3}};
        System.out.println(countNegatives1(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int col : row) {
                if (col < 0){
                    count++;
                } 
            }
        }
        return count;
    }
    public static int countNegatives1(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            int start = 0;
            int end = row.length - 1;

            while (start <= end){
                int mid = start + (end - start)/2;
                if (row[mid] < 0){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            count += row.length - start;
        }
        return count;
    }
}
