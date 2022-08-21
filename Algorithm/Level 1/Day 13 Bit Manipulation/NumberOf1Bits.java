public class NumberOf1Bits {
    public static void main(String[] args) {
        
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        int x = 0;
        while (x < 32){
            if ((n & 1) == 1){
                ones++;
            }
            n = n >> 1;
            x++;
        }
        return ones;
    }

    public int hammingWeight1(int n) {
        int ones = 0;
        while (n!=0){
            if ((n & 1) == 1){
                ones++;
            }
            n = n >>> 1;
        }
        return ones;
    }
    public int hammingWeight2(int n) {
        int ones = 0;
        while (n!=0){
            ones+=(n & 1);
            n = n >>> 1;
        }
        return ones;
    }
}
