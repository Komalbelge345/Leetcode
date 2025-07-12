public class painterpartitionproblem {
    public static boolean isPossible(int arr[], int maxTime, int k) {
        int painter = 1;
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            if (time + arr[i] <= maxTime) {
                time += arr[i];
            } else {
                painter++;
                time = arr[i];
            }

        }
        if (painter > k) {
            return false;
        }
        return true;
    }

    public static int painterPartition(int arr[], int k) {
        int si = Integer.MIN_VALUE;
        int ei = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            ei += arr[i];
            si = Math.max(si, arr[i]);
        }
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (isPossible(arr, mid, k)) {
                result = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 30, 20, 15 };
        int k = 3;
        System.out.println(painterPartition(arr, k));

    }

}
