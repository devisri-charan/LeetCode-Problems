public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int amount : customer) {
                wealth += amount;
            }
            if (wealth > maximumWealth){
                maximumWealth = wealth;
            }
        }
        return maximumWealth;
    }
}
