import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int s = pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
                row.add(s);
            }
            row.add(1);
            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }
}
