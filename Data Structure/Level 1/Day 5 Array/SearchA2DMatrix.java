public class SearchA2DMatrix {
    public static void main(String[] args) {
        
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row*col - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == matrix[mid/col][mid%col]){
                return true;
            }
            else if (target > matrix[mid/col][mid%col]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return false;
    }
}
