public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Films Daniels");
        System.out.println("Filme: Projeto X: Uma Festa Fora de Controle");

        int anoLancamento = 2012;
        System.out.println("Ano de lançamento: " + anoLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 5.0;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("A média do filme: " + media);
        String sinopse;
        sinopse = """
                Filme Projeto X: Uma Festa Fora de Controle
                Filme de Comédia
                Muito bom!
                Ano de lançamento
                """ + anoLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media  /2);
        System.out.println(classificacao);


    }
}