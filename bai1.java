package btaptuan3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 1 so");
		int so = sc.nextInt();
		if (so == 0)
			System.out.println("bang 0");
		else if (so > 0)
			System.out.println(so + "la so duong");
		else
			System.out.println(so + "la so am");

	}

}
