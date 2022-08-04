import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// You are given a 0-indexed string num of length n 
// consisting of digits.

// Return true if for every index i in the range 0 <= i < n
// the digit i occurs
// num[i] times in num, otherwise return false.

class Solution {
    public boolean digitCount(String num) {
        char[] s = num.toCharArray();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int noOftimes = num.charAt(i);
            int digitCount = 1;
            if (map.containsKey(num.charAt(i))){
                map.replace(noOftimes, digitCount, digitCount+1);
            }
            map.put(noOftimes, digitCount);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}