package BaiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập điểm: ");
        double n = sc.nextDouble();
        if(n>=8.0)
            System.out.println("Xếp loại: Giỏi.");
        else
            if(n>=6.5)
                System.out.println("Xếp loại: Khá.");
            else
                if(n>=4.0)
                    System.out.println("Xếp loại: Trung Bình.");
                else
                    System.out.println("Xếp loại: Yếu.");
    }
}
