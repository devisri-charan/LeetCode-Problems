public class PowerOfTwo{
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 32; i++) {
            if (Math.pow(2, i) == n){
                return true;
            }
        }
        return false;
    }

    public static boolean isPowerOfTwo1(int n) {
        if (n <= 0){
            return false;
        }
        else{
            return (n & n-1) == 0;
        }
    }
}