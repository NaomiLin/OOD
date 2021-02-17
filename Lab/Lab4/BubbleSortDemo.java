package Lab.Lab4;

public class BubbleSortDemo {
    public static void main(String[] args) {
        double[] nums = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};
        System.out.println("Array contents before sorting:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        BubbleSort.sort(nums);
        System.out.println("Sorted array values:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
