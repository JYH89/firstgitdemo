package test2;

import java.io.*;

public class FileDemo {
    public static void main(String []args){
        try {
            FileInputStream fis=new FileInputStream("JYH.jpg");
            FileOutputStream fos=new FileOutputStream("JHY.jpg");
            int n=0;
            byte[] b=new byte[1024];
            while((n=fis.read(b))!=-1){
                   fos.write(b,0,n);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}

