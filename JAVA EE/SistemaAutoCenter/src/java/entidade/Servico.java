package entidade;


public class Servico {
    private int id;
    private String tipo;
    private double preco;
    private String image;
    private String dica;

    public Servico() {
    
    }

    public Servico(int id, String tipo, double preco, String image) {
        this.id = id;
        this.tipo = tipo;
        this.preco = preco;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
    
    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", tipo=" + tipo + ", preco=" + preco + ", image=" + image + '}';
    }
    
}
