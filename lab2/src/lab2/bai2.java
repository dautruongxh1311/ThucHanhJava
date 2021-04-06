/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int a[];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            double randomNumber = Math.random();
            randomNumber = randomNumber * 100 + 1;
            a[i] = (int) randomNumber;

        }
        System.out.println("Mang phat sinh la : ");
        xuatMang(a, n);
        System.out.print("xuất các phần tử :");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNguyenTo(a[i])) {
                System.out.print("\t" + a[i]);
            }
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        // < 2 khong phai la SNT
        boolean check = false;
        if (n < 2) {
            return check;
        }
        //n > 2
        int aaa = (int) Math.sqrt(n);
        for (int i = 2; i <= aaa; i++) {
            if (n % i == 0) {
                return check = true;
            }
        }
        return check;
    }
}
