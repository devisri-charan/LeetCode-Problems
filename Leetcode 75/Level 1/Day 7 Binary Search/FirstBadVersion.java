public class FirstBadVersion {
    static int bad = 1;
    public static void main(String[] args) {
        int n = 1;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left<right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int version){
        if (version == bad){
            return true;
        }
        
        return false;
    }
}