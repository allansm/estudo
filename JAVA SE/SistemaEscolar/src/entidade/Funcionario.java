package entidade;


public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private String turno;
    private double salario;
    private String dtadmissao;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(String dtadmissao) {
        this.dtadmissao = dtadmissao;
    }
    
}
