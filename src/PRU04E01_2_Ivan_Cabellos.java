import java.io.*;

public class PRU04E01_2_Ivan_Cabellos {

    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new FileReader("javaExample.java"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("javaWithoutComments.java"));
            String line;
            String ln = System.getProperty("line.separator");
            boolean comentario = false;
            while (br.read() != -1){
                line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '/' && line.charAt(i + 1) == '/' || line.charAt(i) == '/' && line.charAt(i + 1) == '*') {
                        comentario = true;
                        break;
                    }

                }
                if(!comentario){
                    bw.write(line + ln);
                }
                comentario = false;
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
