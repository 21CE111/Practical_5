/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.io.*;
class practical5_4_1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) //read char by char
            System.out.println((char)fChar); //write char by char
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
