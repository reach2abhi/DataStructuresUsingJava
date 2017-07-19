package stackTest;

public class PostToInfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack S = new StackArray();
		String postfix = "53*2+64*+";
		char[] expr = postfix.toCharArray();

		for (int i = 0; i < expr.length; i++) {
			if (Character.isDigit(expr[i])) {
				S.push(Character.getNumericValue(expr[i]));
			} else {
				int x = S.pop();
				int y = S.pop();
				char operator = expr[i];
				switch (operator) {
				case '+':
					S.push(x + y);
					break;
				case '-':
					S.push(x - y);
					break;
				case '*':
					S.push(x * y);
					break;
				case '/':
					S.push(x / y);
					break;
				}

			}

		}
		System.out.println("The expression evaluates to: " + S.top());
	}

}
