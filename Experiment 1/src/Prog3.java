import java.util.*;

public class Prog3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		String opr;
		System.out.println("Enter The number 1 :");
		num1 = in.nextInt();
		System.out.println("Enter The number 2 :");
		num2 = in.nextInt();
		System.out.println("Enter The Operation:");
		opr = in.next();
		switch (opr) {
		case "+":
			System.out.print("Result : " + (num1 + num2));
			break;
		case "-":
			System.out.print("Result : " + (num1 - num2));
			break;
		case "/":
			System.out.print("Result : " + (num1 / num2));
			break;
		case "*":
			System.out.print("Result : " + (num1 * num2));
			break;
		default:
			System.out.println("Choose the correct operator!!");
		}
	}

}
