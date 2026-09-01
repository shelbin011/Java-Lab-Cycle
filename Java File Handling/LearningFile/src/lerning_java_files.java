import java.io.File;
import java.io.IOException;

public class lerning_java_files {

    public static void main(String[] args) throws IOException {
        File f = new File("testFile.txt");
        if (f.createNewFile()) {
            System.out.println("file Created");
        } else {
            System.out.printf("Failed");
        }
    }
}