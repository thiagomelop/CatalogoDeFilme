public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano do lançamento é " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notasDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
        Filme: Top Gun: Maverick
        Filme de aventura com o galã dos anos 80
        Muito bom
        Ano de lançamento do filme é
        """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2); // convertendo o valor em inteiro
        System.out.println(classificacao);

    }
}