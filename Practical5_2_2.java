/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.io.*;
class practical5_2_2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new
                    FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
            targetStream = new FileOutputStream
                    ("C:\\Users\\hp\\OneDrive\\Documents\\2.txt");

            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}
