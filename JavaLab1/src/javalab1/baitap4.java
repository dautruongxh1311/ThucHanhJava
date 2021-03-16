/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;
import java.io.*;
import java.io.*;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class baitap4 {
    private static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Nhap n :");
        int m =n.nextInt();
        
        System.out.println("Cac so nguy to nho hon n la \n:"+m);
        if(m>=2)
            System.out.println(2);
        for(int i=3;i<m;i+=2)
            if (Min(i)){
                System.out.println(""+i);
            }
    }
    public static boolean Min(int m){
        if(m<2)
            return false;
        int sobe=(int) Math.sqrt(m);
        for(int i=2;i<=sobe;i++){
            if(m%i==0)
                return false;
    }return true;
    }
    
}
