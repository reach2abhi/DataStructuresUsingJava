package stack;

public class BracketMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="{()}";
		Boolean result;
		result=BracketMatching.isMatched(pattern);
		System.out.println(result?"Match success":"Match Failed");
	}

	public static boolean isMatched(String expression) {
		final String opening = "({["; // opening delimiters
		final String closing = ")}]"; // respective closing delimiters
		stack<Character> buffer = new StackArray<Character>();
		for (char c : expression.toCharArray()) {
			if (opening.indexOf(c) != -1) // this is a left delimiter
				buffer.push(c);
			else if (closing.indexOf(c) != -1) { // this is a right delimiter
				if (buffer.isEmpty()) // nothing to match with
					return false;
				if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false; // mismatched delimiter
			}
		}
		return buffer.isEmpty(); // were all opening delimiters matched?
	}

}
