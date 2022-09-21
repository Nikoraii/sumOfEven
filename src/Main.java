import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] sumEven = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int value = queries[i][0];
            int index = queries[i][1];
            nums[index] += value;
            for (int num: nums) {
                if (num % 2 == 0) sum += num;
            }
            sumEven[i] = sum;
        }
        return sumEven;
    }
}