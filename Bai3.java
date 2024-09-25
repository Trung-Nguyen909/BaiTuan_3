/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap he so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap he so b: ");
        double b = sc.nextDouble();
        System.out.print("nhap he so c: ");
        double c = sc.nextDouble();
        giaipt(a, b, c);
    }
    public static void giaipt(double a, double b, double c) {
        if (a == 0) {
            if (b != 0) {
                System.out.println("phuong trinh co nghiem duy nhat x = " + (-c / b));
            } else if (c == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep x = " + x);
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        }
    }
    
}
