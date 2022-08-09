import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,3,11};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(2*arr[i]) || (arr[i] % 2 == 0 && hashSet.contains(arr[i]/2))){
                    return true;
            }
            else{
                hashSet.add(arr[i]);
            }
        }
        return false;
    }

    public static boolean checkIfExist1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
