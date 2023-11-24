public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notasDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindos");
        } else {
            System.out.println("Filmes retrô");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Precisa pagar a locação!");
        }
        if (notasDoFilme >= 8 && anoDeLancamento >= 2022) {
            System.out.println("Filme recente com ótimas avaliações");
        } else {
            System.out.println("Filmes um pouco mais antigos e com baixas avaliações!");
        }
    }
}