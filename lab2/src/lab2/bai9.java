/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author Administrator
 */
public class bai9 {
    public static void main(String[] args)throws IOException 
    {
        try
        (
        FileOutputStream os = new FileOutputStream("abc.txt")){
        String s = "chao moi nguoi den voi doc xuat file";
        for(int i=0;i< s.length();i++)
            os.write(s.charAt(i));
            
        }
    try
        (
        FileInputStream is = new FileInputStream("abc.txt")){
        int ibyts = is.available( );
        String s = "chao moi nguoi den voi doc xuat file";
        System.out.println("file co tat ca "+ibyts+"ky tu");
        byte ibuf[ ]= new byte[ibyts];
        int byrd = is.read(ibuf,0,ibyts);
        System.out.println("Tong So ky tu duoc duoc la:"+byrd);
        System.out.println("Chuoi ky tu la :"+new String (ibuf));
        }
    }
    
}
