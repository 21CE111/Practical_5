/*
    Name : Rushit Rabadiya
    ID   : 21CE111
*/
import java.io.*;
class practical5_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new
                    FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
            out = new
                    FileOutputStream("C:\\Users\\hp\\OneDrive\\Documents\\2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(IOException ie) {

        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
