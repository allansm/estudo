package entidade;


public class Venda {
    private int id;
    private int cliente;
    private int quantProduto;
    private int produto;
    private int servico;
    private String data;

    public Venda() {
    
    }

    public Venda(int id, int cliente, int quantProduto, int produto, int servico) {
        this.id = id;
        this.cliente = cliente;
        this.quantProduto = quantProduto;
        this.produto = produto;
        this.servico = servico;
    }
    
    
    
    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }
    
    
    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getServico() {
        return servico;
    }

    public void setServico(int servico) {
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", quantProduto=" + quantProduto + ", produto=" + produto + ", servico=" + servico + '}';
    }
    
}
