/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;
import java.util.*;
public class Bai5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("nhap canh c: ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a))
              if (a == b && b == c)
            System.out.println("day la tam giac deu.");
        else if (a == b || a == c || b == c)
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
                System.out.println("day la tam giac vuong can.");
            else 
                System.out.println("day la tam giac can.");
 
        else    
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
                System.out.println("day la tam giac vuong.");
        else 
            System.out.println("day la tam giac thuong.");
           else
            System.out.println("ba canh nay khong phai tam giac.");
        }}
