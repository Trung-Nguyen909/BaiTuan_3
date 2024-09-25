package BaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("Số "+n+" là số dương");
        else
        if(n==0)
            System.out.println("Số nhập vào là số O");
        else
            System.out.println("Số "+n+" là số âm");//hello
    }
}
