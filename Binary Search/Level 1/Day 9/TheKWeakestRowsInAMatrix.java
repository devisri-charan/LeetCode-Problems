import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;
        System.out.println(kWeakestRows(mat, k));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        for (int i = 0; i < mat.length;i++) {
            int start = 0;
            int end = mat[i].length - 1;
            while (start <= end){
                int mid = start + (end - start)/2;
                if (mat[i][mid] != 0){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            heap.add(new int[]{start,i});
        }
        int[] weakestRowsIndices = new int[k];
        for (int j = 0; j < k; j++) {
            weakestRowsIndices[j] = heap.remove()[1];
        }
        return weakestRowsIndices;
    }
}
