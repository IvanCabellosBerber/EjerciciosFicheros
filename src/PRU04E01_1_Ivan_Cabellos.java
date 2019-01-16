import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PRU04E01_1_Ivan_Cabellos {

    public static void main(String[] args) {

        String nl = System.getProperty("line.separator");
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        BufferedReader br;
        BufferedWriter bw;

        String linea;
        ArrayList<String> palabras = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader("C:\\Temp\\" + args[0]));
            bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));

            while (br.read() != -1) {
                linea = br.readLine();
                palabras.add(linea);

                System.out.println(linea);
            }
            Collections.sort(palabras);
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println(palabras.get(i));
                bw.write(palabras.get(i) + nl);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
