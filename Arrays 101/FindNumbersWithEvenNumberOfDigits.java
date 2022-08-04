public class  FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (hasEvenNoOfDigits(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean hasEvenNoOfDigits(int num) {
        int noOfDigits = 0;
        while (num > 0){
            noOfDigits +=1;
            num = num/10;
        }
        
        return noOfDigits%2 == 0;
    }
}
