/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.io.*;
class practical5_4_2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new
                    FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
            fos = new FileOutputStream
                    ("C:\\Users\\hp\\OneDrive\\Documents\\2.txt");
            int temp;
            while ((temp = fis.read()) != -1) //read byte by byte
                fos.write((byte)temp); //write byte by byte
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
