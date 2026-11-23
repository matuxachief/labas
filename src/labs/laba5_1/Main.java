package labs.laba5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMapImpl<String> map = new HashMapImpl<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ");
            String command = parts[0];

            if (command.equals("put")) {
                String key = parts[1];
                String value = parts[2];
                map.put(key, value);
            } else if (command.equals("get")) {
                String key = parts[1];
                System.out.println(map.getValue(key));
            } else if (command.equals("delete")) {
                String key = parts[1];
                map.delete(key);
            }
        }
        scanner.close();
    }
}