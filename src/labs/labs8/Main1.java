package labs.labs8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        long[] pref = new long[n + 1];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + Long.parseLong(tokenizer.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);

            long sum = pref[r + 1] - pref[l];
            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString());
        reader.close();
    }
}