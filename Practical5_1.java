/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.io.File;
class Practical5_1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\hp\\OneDrive\\Documents\\1.txt");
        System.out.println("File name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Absolute path : "
                +f.getAbsolutePath());
        System.out.println("Parent : "+f.getParent());
        System.out.println("Existance of file : "+f.exists());
        if(f.exists())
        {
            System.out.println("can we write? : "+f.canWrite());
            System.out.println("readable? : "+f.canRead());
            System.out.println("Is a directory : "+f.isDirectory());
                    System.out.println("File Size(bytes) : "+f.length());
        }
    }
}