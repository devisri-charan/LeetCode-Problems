public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }

    public static int signFunc(int x){
        if (x < 0){
            return -1;
        }
        else if (x == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int arraySign(int[] nums) {
        int sign = signFunc(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            sign*=signFunc(nums[i]);
        }
        return sign;
    }
}
