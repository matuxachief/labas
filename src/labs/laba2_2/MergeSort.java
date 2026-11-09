package labs.laba2_2;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting<Integer> {
    private void slice(List<Integer> list, int from, int to) {
        if (from >= to) {
            return;
        }
        int mid = from + (to - from) / 2;
        slice(list, from, mid);
        slice(list, mid + 1, to);
        merge(list, from, mid, to);
    }

    private void merge(List<Integer> list, int from, int mid, int to) {
        List<Integer> leftPart = new ArrayList<>(list.subList(from, mid + 1));
        List<Integer> rightPart = new ArrayList<>(list.subList(mid + 1, to + 1));

        int a = 0;
        int b = 0;
        int pos = from;

        while (a < leftPart.size() && b < rightPart.size()) {
            if (leftPart.get(a) <= rightPart.get(b)) {
                list.set(pos, leftPart.get(a));
                a++;
            } else {
                list.set(pos, rightPart.get(b));
                b++;
            }
            pos++;
        }

        while (a < leftPart.size()) {
            list.set(pos, leftPart.get(a));
            a++;
            pos++;
        }

        while (b < rightPart.size()) {
            list.set(pos, rightPart.get(b));
            b++;
            pos++;
        }
    }

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size() - 1);
    }
}