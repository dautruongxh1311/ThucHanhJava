/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;
import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class JavaLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello! I’m Vu Van Manh.");
        System.out.println("This is my first java program.");
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap ma SV:");
        String maSV=x.nextLine();
        /////nhap ten///
        Scanner y= new Scanner(System.in);
        System.out.println("Nhap ten SV:");
        String tenSV=y.nextLine();
        
        ///nhap tuoi/////
        Scanner z=new Scanner(System.in);
        System.out.println("Nhap tuoi");
        byte tuoi =z.nextByte();
    }
    
}
