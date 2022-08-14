public class ArrangingCoins{
    public static void main(String[] args) {
        // int n = 8;
        // System.out.println(arrangeCoins(n));
        // System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        if (n==1 || n==2){
            return 1;
        }

        if (n==3){
            return 2;
        }
        
        long start = 2;
        long end = n/2;
        long noOfCompleteRows = 1;

        while (start <= end){
            long mid  = start + (end - start)/2;
            long coins = mid*(mid+1)/2;
            if (coins <= n){
                start = mid + 1;
                noOfCompleteRows = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)noOfCompleteRows;
    }
    public static int arrangeCoins1(int n) {
        int noOfCompleteRows = 0;
        int i = 1;
        while (i <= n) {
            n -= i;
            noOfCompleteRows ++;
            i++;
        }
        return noOfCompleteRows;
    }
}