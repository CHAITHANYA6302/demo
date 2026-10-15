package hello;
import java.util.Stack;

public class BalancedParentheses {
	static boolean isBalanced(String str) {
		Stack<Character> stack = new  Stack<>();
		for(char ch: str.toCharArray()) {
			if(ch == '(' || ch == '[' || ch =='{') {
				stack.push(ch);
			}
			else if(ch == ')' || ch == ']' || ch =='}') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if(ch ==')' && top !='(') {
					return false;
				}
				if(ch ==']' && top != '[') {
					return false;
				}
				if(ch == '}' && top != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[]args) {
		System.out.println(isBalanced("{[()]}"));
		System.out.println(isBalanced("{[(])}"));
	}

}