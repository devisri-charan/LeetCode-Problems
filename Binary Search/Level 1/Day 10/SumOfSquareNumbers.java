public class SumOfSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(0));
        System.out.println(judgeSquareSum(1));
        System.out.println(judgeSquareSum(2));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(4));
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(25));
        System.out.println(judgeSquareSum(169));
        System.out.println(judgeSquareSum(400));
        System.out.println(judgeSquareSum(2147483647));
    }

    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = c - (c)/2;

        while (start <= end){
            long start2 = start*start;
            long end2 = end*end;

            long sum = start2 + end2;
            
            if (sum == c){
                return true;
            }

            long mid = start + (end - start)/2;
            long mid2 = mid*mid;

            if (sum > c){
                if (start2 + mid2 > c){
                    end = mid - 1;
                }
                else{
                    end--;
                }
            }
            else{
                if (mid2 + end2 < c){
                    start = mid + 1;
                }
                else{
                    start++;
                }
            }
        }
        return false;
    }
    public static boolean judgeSquareSum1(int c) {
        long start = 0;
        long end = (int)Math.sqrt(c);

        while (start <= end){
            long sum = start*start + end*end;
            
            if (sum == c){
                return true;
            }

            else if (sum > c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
