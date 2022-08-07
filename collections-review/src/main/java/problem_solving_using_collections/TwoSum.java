package problem_solving_using_collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    Two sum:
    * Given an integer array of nums and integer target, find the indices of two numbers in the array that sum up to
    * the value given as target.
    * Assume there can only be 1 solution
    * Negatives integers are accepted in nums

     */

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9,10,11,12,13};
        int[] solution1 = solution1(nums, 9);
        int[] solution2 = solution2(nums, 9);


        System.out.println(nums[solution1[0]] + " + " + nums[solution1[1]] + " = " + 9);
        System.out.println(Arrays.toString(solution1));
        System.out.println(Arrays.toString(solution2));
    }

    public static int[] solution1(int[] nums, int target) { //brute n*n
        for (int i = 0; i < nums.length - 1; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return new int[]{};
    }

    public static int[] solution2(int[] nums, int target) { //using hashmap o(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            map.put(value , i  );
            if(map.containsKey(target - value)) {
                return new int[]{i,map.get(target - value)};
            }
        }

        return new int[]{};
    }

}
