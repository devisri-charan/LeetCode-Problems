import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight{
    public static void main(String[] args) {
        int[] stones = {1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            heap.add(stones[i]);
        }

        while (heap.size() > 1){
            int y = heap.poll();
            int x = heap.poll();
            if (x > y){
                heap.add(y-x);
            }
        }
        if (heap.isEmpty()){
            return 0;
        }
        else{
            return heap.poll();
        }
    }
}