public class NumberOf1Bits{
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        int x = 0;

        while (x > 32){
            count+=(n & 1);
            n = n>>1;
            x++;
        }
        return count;
    }
}