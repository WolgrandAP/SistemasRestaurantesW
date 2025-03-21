import java.util.HashMap;

public class Pedido {

    private Item item;
    private Cliente cliente;
    private HashMap<String, Double> listaIntens;
    private double totalPagar;

    public Pedido(Item item, Cliente cliente, HashMap<String, Double> listaIntens) {
        this.item = item;
        this.cliente = cliente;
        this.listaIntens = listaIntens;
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

    public double getTotalPagar() {
        return totalPagar;
    }

    public double setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
        return totalPagar;
    }

    public void adicionarItem(Item item) {

        listaIntens.put(item.getProduto(),item.getPreco());
        setTotalPagar(getTotalPagar()+item.getPreco());
    }

    public HashMap<String, Double> mostrarLista() {
        return listaIntens;
    }

}