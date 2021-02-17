package Lab.Lab4;

public class BubbleSort {
    public static void sort(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }
    public static void swap(double[] nums, int i, int j) {
        double temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
