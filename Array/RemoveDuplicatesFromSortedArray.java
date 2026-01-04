package Array;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums){

        int ref = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ref] = nums[i];
                ref++;
            }
        }

        return ref;
    }

}
