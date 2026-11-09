package labs.laba2_1;

import java.util.List;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        for (int pos = 1; pos < nums.size(); pos++) {
            int current = nums.get(pos);
            int prev = pos - 1;
            while (prev >= 0 && nums.get(prev) > current) {
                nums.set(prev + 1, nums.get(prev));
                prev--;
            }
            nums.set(prev + 1, current);
        }
    }
}