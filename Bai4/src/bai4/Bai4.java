/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("nhap so thu hai: ");
        int b = sc.nextInt();
        System.out.print("nhap so thu ba: ");
        int c = sc.nextInt();
        int min=a;
        if (min>b) min=b;
        if (min>c) min=c;
        System.out.println("so nho nhat la: " + min);    
    }
    
}
