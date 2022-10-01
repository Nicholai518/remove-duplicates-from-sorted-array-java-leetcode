public class Solution {
    public int removeDuplicates(int[] nums) {
        // pointer/ number of unique elements
        int j = 1;

        // iterate through the array
        for (int i = 0; i < nums.length - 1; i++) {
            // if the number at index i is different from the number at index j
            if (nums[i] != nums[i + 1]) {
                // update the element at index j & increment j for next unique number
                nums[j] = nums[i + 1];
                j++;
            }
        }
        // number of unique elements
        return j;
    }
}

