import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu nome completo:");
        String nome = leitura.nextLine();

        System.out.println("Informe sua idade:");
        int idade = leitura.nextInt();

        System.out.println("Informe sua altura:");
        double altura = leitura.nextDouble();

        String mensagem = """
                Olá  %s !
                Boa vindas !
                Você tem %d ano de idade e mede %2f cm de altura
                """.formatted(nome, idade, altura);

        System.out.println(mensagem);






        /*System.out.println("Digite o seu filme favorito:");
        String filme = leitura.nextLine(); // .nextLine() faz a leitura de string

        System.out.println("Qual o ano de Lançamento deste filme ?");
        int anoDeLancamento = leitura.nextInt(); // .nextInt() faz a leitura de um valor inteiro

        System.out.println("Dê sua nota sobre esse filme (De 0 a 10):");
        double nota = leitura.nextDouble();

        System.out.println("O filme favorito é " + filme + ", lançado em " + anoDeLancamento + " e sua nota foi de " + nota);

        */
    }
}
