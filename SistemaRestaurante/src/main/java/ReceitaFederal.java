import java.util.HashMap;

public class ReceitaFederal {

    private Item item;
    private Cliente cliente;
    private Pedido pedido;

    public ReceitaFederal(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }



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
