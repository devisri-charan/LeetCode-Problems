import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        String[] words1 = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k1 = 4;
        System.out.println(topKFrequent(words, k));
        System.out.println(topKFrequent(words1, k1));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> topKFrequentWords = new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0)+1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (hashMap.get(s1) == hashMap.get(s2)) {
                    return s1.compareTo(s2);
                }
                return hashMap.get(s2) - hashMap.get(s1);
            }
        });
        heap.addAll(hashMap.keySet());
        for (int i = 0; i < k; i++) {
            if (!heap.isEmpty()){
                topKFrequentWords.add(heap.poll());
            }
        }
        return topKFrequentWords;
    }
}
