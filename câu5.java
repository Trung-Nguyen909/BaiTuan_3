package btaptuan3;

import java.util.Scanner;

public class câu5 {

	public static boolean isTriangle(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static String classifyTriangle(double a, double b, double c) {
		if (a == b && b == c) {
			return "Tam giác đều";
		} else if (a == b || b == c || a == c) {
			return "Tam giác cân";
		} else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
			return "Tam giác vuông";
		} else {
			return "Tam giác thường";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập cạnh a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập cạnh b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập cạnh c: ");
		double c = scanner.nextDouble();

		if (isTriangle(a, b, c)) {
			System.out.println("Ba cạnh tạo thành một tam giác.");

			System.out.println("Loại tam giác: " + classifyTriangle(a, b, c));
		} else {
			System.out.println("Ba cạnh không tạo thành một tam giác.");
		}

		scanner.close();
	}
}
