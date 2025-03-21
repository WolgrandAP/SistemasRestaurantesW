public class ReceitaFederal {

    private Item item;
    private Cliente cliente;
    private Pedido pedido;

    public double taxacaoPix(){

        return pedido.setTotalPagar(pedido.getTotalPagar() * 1.05);

    }

    public double taxacaoCartao(){

        return pedido.setTotalPagar(pedido.getTotalPagar() * 1.10);

    }

    public double taxaCobradaPix() {

        return pedido.setTotalPagar(pedido.getTotalPagar() * 0.05);
    }

    public double taxaCobradaCartao() {

        return pedido.setTotalPagar(pedido.getTotalPagar() * 0.10);
    }

}
