/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai10 {

    public static void main(String[] args) throws Exception {
        String fileName = "";
        File f = new File("");
        fileName = f.getAbsolutePath() + "\\src\\data.txt";
        f = new File(fileName);
        if (f.exists()) {
            System.out.println("file da ton tai");
            System.exit(0);
        }
        // ghi cdu lieu vao file
        PrintWriter pw = new PrintWriter(f);
        pw.print("Copyright by vu van manh-");
        pw.println(2021);
        pw.print("http://sinhvien.net");
        System.out.println("Da ghi file xong");
        pw.close();
        // doc file
        Scanner inp = new Scanner(f);
        while (inp.hasNext())
        {
            String ten = inp.nextLine();
            System.out.print(ten + " ");
            String maso = inp.nextLine();
            System.out.println(maso);
        }

    }

}
