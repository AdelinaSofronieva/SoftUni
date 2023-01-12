package J04StreamsFilesAndDirectories.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/picture.jpg");
        FileOutputStream fos = new FileOutputStream("src/J04StreamsFilesAndDirectories/Exercise/Exercises JavaAdvanced.Resources/pictureCopy.jpg");

        byte[] buffer = new byte[1024];
        while(fis.read(buffer) >= 0){
            fos.write(buffer);
        }

        fis.close();
        fos.close();
    }
}