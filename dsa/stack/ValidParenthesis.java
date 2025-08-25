import java.util.*;

/*
An string is valid if every opening bracket has a corresponding closing bracket of the same type
and brackets are closed in the correct order.
*/
public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(')
                            || (c == '}' && top == '{')
                            || (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {

        String test1="{}{}";
        String test2="{[]";
        String test3 = "{[()]}";
        System.out.println(test1 + " is valid? "+isValid(test1));
        System.out.println(test2 + " is valid? "+isValid(test2));
        System.out.println(test3 + " is valid? " + isValid(test3));

    }
}
