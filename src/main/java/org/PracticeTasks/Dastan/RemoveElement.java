package org.PracticeTasks.Dastan;

public class RemoveElement {
    /**
     * Суть задачи: Дается массита int[] nums, и число val.
     * Если число val содержится в int[] nums, вернуть количесвто int без подсчета val
     * Например : nums = [3,2,2,3], val = 3 / Возращает нам 2.
     */

    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
