package Practice17;
/*
        Homework Task:
        Right parenthesis:
        { ( [ ] ) }
        "[]]" // false
        "([])" // true
        "([[{}]])" // true
        "([[{})" // false
        "(([])" // false
///this is df
        Using stack
*/

import java.util.List;
import java.util.Stack;

public class SearchByStack {
    public static void main(String[] args) {
        Stack<Character> list = new Stack<>();
        System.out.println("Result: " + CheckSymbol("{}["));
    }


    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char pop_val = stack.pop();
                    if (s.charAt(i) == ')' && pop_val != '(') {
                        return "NO";
                    } else if (s.charAt(i) == '}' && pop_val != '{') {
                        return "NO";
                    } else if (s.charAt(i) == ']' && pop_val != '[') {
                        return "NO";
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static boolean CheckSymbol(String symbols) {
        boolean result = false;
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < symbols.length(); i++) {
            list.push(symbols.charAt(i));
        }
        if (list.isEmpty() || list.size() % 2 != 0) {
            return false;
        }
            for (int i = 0; i < list.size(); i++) {
                Character popElement = list.pop();
                if (popElement == ')' && list.contains('(')) {
                    list.remove(list.indexOf('('));
                    result = true;
                } else if (popElement == '}' && list.contains('{')) {
                    list.remove(list.indexOf('{'));
                    result = true;
                } else if (popElement == ']' && list.contains('[')) {
                    list.remove(list.indexOf('['));
                    result = true;
                } else return false;
            }
        return result;
    }
}
