public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(2));
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0 || (n & n-1) != 0){
            return false;
        }
        else{
            return (n-1)%3 == 0;
        }
    }
}
