import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku{
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','1','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board)); 
    }

    public static boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<List<Set<Character>>> boxes = new ArrayList<>();
        
        for (int row = 0; row < 9; row++) {
            rows.add(new HashSet<>());
        }
        for (int col = 0; col < 9; col++) {
            cols.add(new HashSet<>());
        }

        for (int row = 0; row < 3; row++) {
            boxes.add(new ArrayList<>());
            for (int col = 0; col < 3; col++) {
                boxes.get(row).add(new HashSet<>());
            }
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.'){
                    int boxRow = row / 3;
                    int boxCol = col / 3;
                    if (rows.get(row).contains(c) || cols.get(col).contains(c) || boxes.get(boxRow).get(boxCol).contains(c)){
                        return false;
                    }
                    rows.get(row).add(c);
                    cols.get(col).add(c);
                    boxes.get(boxRow).get(boxCol).add(c);
                }
            }
        }
        return true;
    }
}