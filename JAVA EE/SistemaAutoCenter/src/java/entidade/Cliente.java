package entidade;

import java.util.Objects;

/*JavaBean - atributos, get/set, construtor vazio, constutor cheio e o toString */

public class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    
    public Cliente(){
    
    }

    public Cliente(int id, String nome, String email, String senha, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }

    
    
}

