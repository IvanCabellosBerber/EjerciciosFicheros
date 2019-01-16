import java.io.*;
import java;
import java;


public class PRU04E01_2_Ivan_Cabellos {

   public static void main(String[] args) {

       try{
           BufferedReader br = new BufferedReader(new FileReader("javaExample.java"));
           BufferedWriter bw = new BufferedWriter(new FileWriter("javaWithoutComments.java"));
           String line;
           boolean comentario = false;
           while (br.read() != -1){
               line = br.readLine();
               for (int i = 0; i < line.length(); i++) {
                   char charActual = line.charAt(i);
                   if (charActual == '/' && line.charAt(i + 1) == '/') {
                       comentario = true;
                       break;
                   }
               }
               if (!comentario){
                   bw.write(line);
               }
               comentario = false;
           }
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

}

