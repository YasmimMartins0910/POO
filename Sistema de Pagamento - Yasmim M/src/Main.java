public class Main {

    public static void main(String[] args) {

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setNumeroCartao("1234 5678 9012 3456");
        pagamentoCartao.setTitular("Yasmim Martins");

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.setChavePix("yasmim@email.com");
        pagamentoPix.setNomeTitular("Yasmim Martins");

        pagamentoCartao.realizarPagamento(150);
        pagamentoPix.realizarPagamento(75);

    }
}