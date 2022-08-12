public class Sqrtx {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        int start = 1;
        int end = x;
        int result = 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid <= x / mid){
                start = mid + 1;
                result = mid;
            }
            else {
                end = mid - 1;
            }

        }
        return result;
    }
}
