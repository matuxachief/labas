package labs.laba3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<BigInteger> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(new BigInteger(sc.next()));
        }
        new RadixSort().sort(nums);
        for (BigInteger x : nums) {
            System.out.println(x);
        }
    }
}