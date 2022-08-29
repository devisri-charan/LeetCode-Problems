public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while (n!=0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n = n/10;
        }
        
        return product - sum;
    }
}
