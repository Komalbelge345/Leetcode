public class BinarySearch {
    public static int searchInsert(int nums[], int target) {
        int si = 0;
        int ei = nums.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return ei + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(searchInsert(arr, target));

    }

}
