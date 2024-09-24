/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        int d = sc.nextInt();
        if (d>=8) System.out.print("GIOI"); else if (d>=6.5) System.out.print("KHA"); else if (d>=5) System.out.print("TRUNG BINH"); else System.out.print("YEU");
    }
    
}
