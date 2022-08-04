public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low = 8;
        int high = 11;
        // 8 9 10 11 12 13 14 (both even) = 7/2 = 3
        // 8 9 10 11 12 13 14 15 (even odd) = 8/2 = 4
        // 9 10 11 12 13 14 (odd even) = 6/2 = 3
        // 9 10 11 12 13 14 15 (both odd) = 7/2 + 1 = 4
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        int nums = high-low+1;  //counting total numbers in range
 
		if (nums%2 != 0){
            if (low%2 == 0 && high%2 == 0){
                return nums/2 + 1;
            }
            else{
                return nums/2;
            }
        }
        
        else{
            return nums/2;
        }
    }
}
