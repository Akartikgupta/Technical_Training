// https://leetcode.com/problems/valid-parentheses/
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        // maintaining the hashmap
        Map<Character, Character> pair = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        pair.put('(', ')');
        pair.put('{', '}');
        pair.put('[', ']');
        char brackets[] = s.toCharArray();
        for (char bracket : brackets) {
            if (pair.containsKey(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();
                char closing = pair.get(opening);
                if (closing != bracket) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}

