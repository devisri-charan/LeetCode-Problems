public class HappyNumber {
    public static void main(String[] args) {

    }

    public static boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        while (true) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            if (sum / 10 == 0) {
                if (sum == 1 || sum == 7) {
                    return true;
                } else {
                    return false;
                }
            }
            n = sum;
        }
    }

    public static boolean isHappy1(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquaresOfDigits(n);
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(n));

            if (slow == 1) {
                return true;
            }
        } while (slow != fast);

        return false;
    }

    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }
}
