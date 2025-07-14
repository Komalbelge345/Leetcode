
import java.util.Arrays;

public class aggresivecowproblem {
    public static boolean isPossible(int arr[], int mid, int k) {
        int cow = 1;
        int lastPos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                cow++;
                lastPos = arr[i];
            }
        }

        return cow >= k;
    }

    public static int aggresiveCow(int arr[], int k) {
        Arrays.sort(arr);
        int result = 0;
        int si = 1;
        int ei = arr[arr.length - 1] - arr[0];
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (isPossible(arr, mid, k)) {
                result = mid;
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 9 };
        int k = 3;
        System.out.println(aggresiveCow(arr, k));
    }

}
