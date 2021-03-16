/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;
import java.io.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class baitap3 {
    public static void main(String[] args) {
        
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = x.nextInt();
        Scanner y= new Scanner(System.in);
        System.out.println("Nhap so b");
        int b = x.nextInt();
        System.out.println("USCLN Cua "+a+" va "+b+" la: "+USCLN(a,b));
        System.out.println("USCNN Cua "+a+" va "+b+" la: "+BSCNN(a,b));
        
       
    }
    public static int USCLN(int a, int b){
        if(b ==0) return a;
            return USCLN(b,a%b);

    }
    public static int BSCNN(int a, int b){
        return (a*b)/USCLN (a,b);
    }
    
}
