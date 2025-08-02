package RecAndbacktrack;

import java.util.*;

public class combinationsum1 {

    public static void combinations(int arr[], int target, int i, ArrayList<Integer> curr,
            ArrayList<ArrayList<Integer>> ans) {
        if (i == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<Integer>(curr));
            }
            return;
        }

        if (target >= arr[i]) {
            curr.add(arr[i]);
            combinations(arr, target - arr[i], i, curr, ans); // include same element again
            curr.remove(curr.size() - 1);
        }

        combinations(arr, target, i + 1, curr, ans); // skip current element
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int arr[], int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        combinations(arr, target, 0, curr, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7 };
        int target = 7;
        ArrayList<ArrayList<Integer>> result = combinationSum(arr, target);
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }
}
