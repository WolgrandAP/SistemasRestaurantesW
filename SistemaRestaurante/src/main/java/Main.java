import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReceitaFederal rf = new ReceitaFederal();

        System.out.println("Digite seu nome:");
        Scanner tec = new Scanner(System.in);
        String nome = tec.nextLine();

        System.out.println("Digite seu CEP: ");
        int cep = tec.nextInt();

        Cliente cliente = new Cliente(nome, cep);

        HashMap<String, Double> catalogo = new HashMap<>();

        Item burger = new Item("Hambúrguer",12.5);
        Item batata = new Item("Batata frita",5);
        Item sanduiche = new Item("Sanduíche",8);

        catalogo.put(burger.getProduto(),burger.getPreco());
        catalogo.put(batata.getProduto(),batata.getPreco());
        catalogo.put(sanduiche.getProduto(), sanduiche.getPreco());

        System.out.println("Escolha um dos produtos abaixo: " + );
        System.out.println("1 - " + burger.getExibirItens());
        System.out.println("2 - " + batata.getExibirItens());
        System.out.println("3 - " + sanduiche.getExibirItens());
        System.out.println("0 - Sair");
        System.out.println("--------------------------------------");

        int n = 1;
        while (n!=0) {

            n = tec.nextInt();





        }

        System.out.println("Digite uma forma de pagamento:\n1-Pix(5% de taxa)\n2-Cartão(10% de taxa)\n3-Dinheiro(Sem taxa)");
        int pag = tec.nextInt();
        switch (pag) {
            case 1:
                System.out.println("Valor final a pagar: R$" + rf.taxacaoPix());
                System.out.println("Taxa cobrada: R$" + rf.taxaCobradaPix());
            case 2:
                System.out.println("Valor final a pagar: R$" + rf.taxacaoCartao());
                System.out.println("Taxa cobrada: R$" + rf.taxaCobradaCartao());
            case 3:
                System.out.println("Valor final a pagar: R$" + );
                System.out.println();
        }


    }
}
