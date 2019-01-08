/*
Input: "()"
Output: true

Input: "(]"
Output: false

Input: "{[]}"
Output: true
 */

import java.util.Stack;

public class VaildParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            if (c == ')') {
                // .pop has already pop the char in the stack
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        VaildParentheses solution = new VaildParentheses();
        System.out.println(solution.isValid("()[]{}({[]})"));
        System.out.println(solution.isValid("(])]"));
    }



}
