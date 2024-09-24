package btaptuan3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		double a = sc.nextDouble();
		System.out.println("nhap b");
		double b = sc.nextDouble();
		System.out.println("nhap c");
		double c = sc.nextDouble();

		double min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		System.out.println("so nho nhat " + min);

	}
}
