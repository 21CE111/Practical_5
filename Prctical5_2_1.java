/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.io.*;
class practical5_2_1 {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new FileReader("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.println((char) temp);
        }
        finally {
            if (source != null)
                source.close();
        }
    }
}

