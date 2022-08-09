public class GuessNumberHigherOrLower {
    static int pick = 1;
    public static void main(String[] args) {
        int n = 2;
        System.out.println(guessNumber(n));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (guess(mid) == -1){
                end = mid - 1; 
            }
            else if (guess(mid) == 1){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int guess(int num){
        if (num > pick){
            return -1;
        }

        else if (num < pick){
            return 1;
        }

        else{
            return 0;
        }
    }
}
