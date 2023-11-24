import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;


        while (nota != -1) { // enquanto o valor da variavel nota for diferente de -1 faça...
            System.out.println("Digite sua avaliação ou -1 para encerrar"); //o valor da avaliação é digitado pelo usuario no teclado
            nota = leitura.nextDouble(); //a variavel nota recebe o valor do teclado inserido pelo usuário...

            if(nota != -1) { // se a variavel nota recebe algum valor diferente de -1, então...
                mediaAvaliacao = mediaAvaliacao + nota; // a variavel médiaAvaliação que iniciou com valor zero agora recebe o valor dela (0) mais o valor da variavel nota (inserido pelo usuário)...
                // ou mediaAvaliacao += nota;
                totalNotas++; // varivael de incremento para saber quantas notas foram digitadas antes de encerrar o programa..
            }

        }


        System.out.println("A média de avaliações é igual a " + mediaAvaliacao/totalNotas); // valores da mediaAvaliação divido pelo total de vezes que foi digitado as notas pelo usuário
    }
}
