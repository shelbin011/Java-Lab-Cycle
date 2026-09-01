import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class co2_lab_q19 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Newfile.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] new_data = line.split(",");
            String name = new_data[0];

            double mark1 = Double.parseDouble(new_data[1]);
            double mark2 = Double.parseDouble(new_data[2]);
            double mark3 = Double.parseDouble(new_data[3]);

            double total = mark1 + mark2 + mark3;
            double average = total / 3;

            // Writing to a file

            FileWriter fr = new FileWriter("outputtest.txt");

            fr.write("Name " + name + "average" + average + "\n");
            fr.close();
        }


    }
}