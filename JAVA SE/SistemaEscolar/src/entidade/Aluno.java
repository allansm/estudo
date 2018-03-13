

package entidade;


public class Aluno {
    private int id;
    private String matricula;
    private String aluno;
    private String turma;
    private String turno;
    private double mensalidade;
    private String pai;
    private String mae;
    private String telefone;
    private String email;
    
    public Aluno(){
    
    }
    public Aluno(String matricula,String aluno,String turma,String turno,double mensalidade,String pai,String mae, String telefone,String email){
        this.matricula = matricula;
        this.aluno = aluno;
        this.turma = turma;
        this.turno = turno;
        this.mensalidade = mensalidade;
        this.pai = pai;
        this.mae = mae;
        this.telefone = telefone;
        this.email = email;
    }
    public Aluno(int id,String matricula,String aluno,String turma,String turno,double mensalidade,String pai,String mae, String telefone,String email){
        this.id = id;
        this.matricula = matricula;
        this.aluno = aluno;
        this.turma = turma;
        this.turno = turno;
        this.mensalidade = mensalidade;
        this.pai = pai;
        this.mae = mae;
        this.telefone = telefone;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
