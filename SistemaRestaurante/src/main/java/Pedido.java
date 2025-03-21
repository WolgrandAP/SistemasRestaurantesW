import java.util.HashMap;

public class Pedido {

    private Item item;
    private Cliente cliente;
    private HashMap<String, Double> listaItens;
    private int quantidade;
    private double totalPagar;

    public Pedido() {
        this.listaItens = new HashMap<>();
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

        String nomeProduto = item.getProduto();
        double precoProduto = item.getPreco();

        listaItens.put(nomeProduto,precoProduto);
        setTotalPagar(getTotalPagar()+item.getPreco());
    }

    public HashMap<String, Double> mostrarLista() {
        return listaItens;
    }

}