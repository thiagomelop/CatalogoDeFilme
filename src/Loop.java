import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import  java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Dê sua nota sobre esse filme (De 0 a 10):");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }

        System.out.println("Média de avaliações é igual a " + mediaAvaliacao/3);


    }


}
