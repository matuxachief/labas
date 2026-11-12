package labs.laba3_1;

import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        int[] count = new int[128];

        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            count[value]++;
        }
        int index = 0;

        for (int value = 0; value < 128; value++) {
            while (count[value] > 0) {
                nums.set(index, value);
                index++;
                count[value]--;
            }
        }
    }
}