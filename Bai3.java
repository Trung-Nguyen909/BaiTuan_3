package BaiTap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập lần lượt a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a==0)
            if(b==0)
                if(c==0)
                    System.out.println("Phương trình có vô số nghiệm");
                else
                    System.out.println("Phương trình vô nghiệm");
            else{
                double x = -c/b;
                System.out.println("Phương trình có 1 nghiệm: x ="+x);
            }
        else {
            double delta = b*b-4*a*c;
            if(delta<0)
                System.out.println("Phương trình vô nghiệm");
            else
                if (delta == 0){
                    double x =-b/(2*a);
                    System.out.println("Phương trình có 1 nghiệm kép: x ="+x);
                }
                else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phương trình có 2 nghiệm: x1= "+x1+" và x2= "+x2);
                }
        }
    }
}
