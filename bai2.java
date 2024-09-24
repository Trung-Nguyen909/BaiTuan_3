package btaptuan3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		System.out.println("Nhập diem tb: ");
		Scanner sc = new Scanner(System.in);
		double tb = sc.nextDouble();
		if (tb >= 8.5)
			System.out.println("gioi");
		else if (tb >= 7.0)
			System.out.println("kha");
		else if (tb >= 5.5)
			System.out.println("tb");
		else
			System.out.println("yeu");

	}
}
