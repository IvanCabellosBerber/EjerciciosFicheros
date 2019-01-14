import java.io.*;
import java.util.Arrays;

public class PRU04E01_1_Ivan_Cabellos {

    public static void main(String[] args) {


        try{
            BufferedReader in = new BufferedReader(new FileReader("words.txt"));
            String line;
            String[] palabras = new String[0];
            while((line = in.readLine())!=null){
                palabras = line.split(" ");
            }

            Arrays.sort(palabras);
            System.out.println(Arrays.toString(palabras));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
