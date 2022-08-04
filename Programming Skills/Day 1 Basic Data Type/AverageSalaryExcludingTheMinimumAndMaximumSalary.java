public class AverageSalaryExcludingTheMinimumAndMaximumSalary{
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        int sum = 0;
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        for (int i : salary) {
            sum += i;
            if (minSalary > i){
                minSalary = i;
            }
            if (maxSalary < i){
                maxSalary = i;
            }
        }
        return ((double)(sum - maxSalary - minSalary))/(salary.length - 2);
    }
}