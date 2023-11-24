import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numCorreto = new Random().nextInt(100);
        int numTentativas = 0;

        while (numTentativas < 5) {
            System.out.println("Digite um número de 0 a 100 para saber se a sorte esta ao seu lado hoje:");
            int numDigitado = leitura.nextInt();
            numTentativas++;

            if (numDigitado == numCorreto){
                System.out.println("Parabéns você acertou em " + numTentativas + " tentativas e o numero correto era " + numCorreto + "!!!");
                break;
            } else if (numDigitado < numCorreto){
                System.out.println("O numero digitado é menor do que o numero correto!");
            } else {
                System.out.println("O numero digitado é maior do que o numero correto!");
            }

            if (numTentativas == 5){
                System.out.println("Você não conseguiu acertar o numero em nenhuma das suas 5 tentativas. O numero correto era " + numCorreto + ". Que pena, não desista. Continue tentando!!!");
            }
        }

    }
}
