package btaptuan3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		System.out.println("nhap b");
		int b = sc.nextInt();
		System.out.println("nhap c");
		int c = sc.nextInt();

		double delta = b * b - 4 * a * c;
		double x1, x2;
		if (delta > 0) {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("pt co 2 nghiem:" + x1 + "va" + x2);

		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("phuong trinh co n kep" + x1);

		} else
			System.out.println("pt vo nghiem");

	}
}
