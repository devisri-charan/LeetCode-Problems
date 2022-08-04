public class FirstBadVersion {
    static int badVersion = 4;
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n){
        int start = 1;
        int end = n;

        while (start < end){
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int version) {
        if (version == badVersion){
            return true;
        }
        return false;
    }
}
