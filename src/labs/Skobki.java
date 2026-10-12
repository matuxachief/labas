package labs;
import java.util.ArrayDeque;
import java.util.Deque;

public class Skobki {

    public static boolean isBalanced(String str) {
        if (str.length() < 1 || str.length() > 10000) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[]"));
        System.out.println(isBalanced("[](){}"));
        System.out.println(isBalanced("[({{}})]"));
        System.out.println(isBalanced("[({{()}{}}]"));
        System.out.println(isBalanced("{]"));
        System.out.println(isBalanced("({)}"));
    }
}