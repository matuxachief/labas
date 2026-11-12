package labs.laba3_2;

import java.math.BigInteger;
import java.util.List;

public class RadixSort implements Sorting<BigInteger> {
    @Override
    public void sort(List<BigInteger> nums) {
        int n = nums.size();
        int maxDigits = 20;
        BigInteger[] output = new BigInteger[n];

        for (int pos = 0; pos < maxDigits; pos++) {
            int[] count = new int[10];
            BigInteger divisor = BigInteger.TEN.pow(pos);

            for (int i = 0; i < n; i++) {
                BigInteger x = nums.get(i);
                int d = x.divide(divisor).mod(BigInteger.TEN).intValue();
                count[d]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                BigInteger x = nums.get(i);
                int d = x.divide(divisor).mod(BigInteger.TEN).intValue();
                count[d]--;
                output[count[d]] = x;
            }

            for (int i = 0; i < n; i++) {
                nums.set(i, output[i]);
            }
        }
    }
}