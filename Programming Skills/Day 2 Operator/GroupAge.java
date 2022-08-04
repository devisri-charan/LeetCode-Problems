public class GroupAge{
    public static void main(String[] args) {
        int[] age = {11,49,100,20,86,29,72};
        int k = 4;
        System.out.println(maxScore(age, k));
    }

    public static int maxScore(int[] cardPoints, int k){
        int start = 0;
        int end = cardPoints.length - 1;
        int count = 0;
        int maxScoreSoFar = 0;
        while (count < k){
            if (cardPoints[start] <= cardPoints[end]){
                maxScoreSoFar += cardPoints[end];
                end--;
                count++;
            }
            else{
                maxScoreSoFar += cardPoints[start];
                start++;
                count++;
            }
        }
        return maxScoreSoFar;
    } 
}