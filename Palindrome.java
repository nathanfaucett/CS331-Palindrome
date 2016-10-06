import java.util.Stack;


public class Palindrome {

	public static void main(String[] args) {
		String value = args[0];
		System.out.println(value + " is" + (isPalindrome(args[0]) ? "" : " not") + " a palindrome");
	}
	
	@SuppressWarnings("unchecked")
	public static boolean isPalindrome(String word) {
		Stack<Character> forward = new Stack<>();
		Stack<Character> backword = new Stack<>();
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (Character.isLetterOrDigit(ch)) {
				forward.push(Character.toLowerCase(ch));
			}
		}
		
		Stack<Character> f = (Stack<Character>) forward.clone();
		
		while (!f.isEmpty()) {
			backword.push(f.pop());
		}
		
		return forward.equals(backword);
	}
}
