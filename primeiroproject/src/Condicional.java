public class

Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoLancamento >= 2022){
            System.out.println("Lançamentos que os cliente estão curtindo");
        } else {
            System.out.println("Filme antigo que vale a pena assistir demais!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else  {
            System.out.println("Filme nao liberado, pague a locação");
        }

    }
}

