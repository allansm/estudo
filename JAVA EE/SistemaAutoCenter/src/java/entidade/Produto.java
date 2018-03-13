package entidade;


public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double precoUnitario;
    private String image;

    public Produto() {
    
    }

    public Produto(int id, String nome, int quantidade, double precoUnitario, String image) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.image = image;
    }
    
    
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", image=" + image + '}';
    }
    
    
    
}
