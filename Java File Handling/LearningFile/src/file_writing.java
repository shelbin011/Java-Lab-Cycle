import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class file_writing {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("testfile.txt",true);
        fw.write("Yes its trueeeee");
        fw.close();
        System.out.println("Done!!!!!!!!!!!!");

        //reading
        FileReader fr = new FileReader("testfile.txt");

        int ch;
        int i=0;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
            i++;
        }
        fr.close();

        System.out.println(i);

        FileWriter fwx = new FileWriter("outputfile.txt",true);
        fwx.write("the output is :"+i);
        fwx.close();
        System.out.println("Done!!!!!!!!!!!!");


        FileReader frx = new FileReader("outputfile.txt");
        int chx;
        while((chx = frx.read()) != -1){
            System.out.print((char)chx);
        }
        frx.close();
    }
}
