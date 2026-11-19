package labs.laba4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MinStack<Integer> stack = new MinStackImpl();
        StringBuilder output = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\s+");
            String command = parts[0];

            if (command.equals("push")) {
                stack.push(Integer.parseInt(parts[1]));
            } else if (command.equals("pop")) {
                stack.pop();
            } else if (command.equals("top")) {
                output.append(stack.top()).append("\n");
            } else if (command.equals("min")) {
                output.append(stack.min()).append("\n");
            }
        }

        System.out.print(output);
    }
}