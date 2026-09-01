import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class file_handling_bufferReader {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("testfile.txt",true);
        fw.write("Yes its trueeeee");
        fw.close();
        System.out.println("Done!!!!!!!!!!!!");

        //reading
        BufferedReader br = new BufferedReader(new FileReader("testfile.txt"));

        String ch;
        int i = 0;
        while((ch = br.readLine()) != null){
            System.out.print(ch);
            i+=1;
        }
        br.close();
        System.out.println(i);

    }
}
