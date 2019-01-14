import java.io.*;
import java.util.Scanner;

public class PRU04E01_3_Ivan_Cabellos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime como será el nombre de tu archivo: ");
        String nomArchivo = sc.next();
        System.out.println("Dime que palabra quieres saber cuantas veces se repite: ");
        String palabraRepetida = sc.next();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArchivo));

            String linea;
            String[] frase;
            int numVecesRepetida = 0;

            while (br.read() != -1){
                linea = br.readLine();
                frase = linea.split(" ");

                for (int i = 0; i < frase.length; i++) {
                    if (palabraRepetida.equals(frase[i])){
                        numVecesRepetida++;
                    }
                }
            }
            System.out.println("Se repite: " + numVecesRepetida);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
