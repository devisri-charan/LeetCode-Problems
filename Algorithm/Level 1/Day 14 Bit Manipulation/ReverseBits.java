public class ReverseBits{
    public static void main(String[] args) {
        
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0){
            return 0;
        }
        int reversedN = 0;
        for (int i = 0; i < 32; i++) {
            reversedN <<= 1;
            reversedN+=(n&1);
            n >>=1;
        }
        return reversedN;
    }
}