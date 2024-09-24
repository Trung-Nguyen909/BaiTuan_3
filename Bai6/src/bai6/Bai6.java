/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;
import java.util.*;
public class Bai6 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Nhap vao 2 so: ");
       int s1 = sc.nextInt();
       int s2 = sc.nextInt();
       System.out.println("Moi lua chon: ");
       System.out.println("1. Cong");
       System.out.println("2. Tru");
       System.out.println("3. Nhan");
       System.out.println("4. Chia");
       int lc = sc.nextInt();
       switch (lc){
            case 1: 
            System.out.print("tong la: " + s1+s2); break;
            case 2: 
            {
               int h=s1-s2;
                System.out.print("hieu la: " + h); break;
            }
            case 3: 
            System.out.print("tich la: " + s1*s2); break;
            case 4: 
            System.out.print("thuong la: " + s1/s2); break;
            
            
       }
    }
    
}
