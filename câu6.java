package btaptuan3;

import java.util.Scanner;

public class câu6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a va b");
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng           ");
		System.out.println("| 2. Trừ               ");
		System.out.println("| 3. nhân           ");
		System.out.println("| 4. chia               ");
		System.out.println("++ ------------------ ++");

		System.out.println("Lựa chọn của bạn là : ");
		int chon = sc.nextInt();
		double kq;
		switch (chon) {
		case 1:
			kq = a + b;
			System.out.println("Kết quả: " + kq);
			break;

		case 2:
			kq = a - b;
			System.out.println("Kết quả: " + kq);
			break;

		case 3:
			kq = a * b;
			System.out.println("Kết quả: " + kq);
			break;

		case 4:
			if (b != 0) {
				kq = a / b;
				System.out.println("Kết quả: " + kq);
			} else {
				System.out.println("Lỗi: Không thể chia cho 0.");
			}
			break;

		default:
			System.out.println("Phép toán không hợp lệ.");
			break;

		}

	}
}
