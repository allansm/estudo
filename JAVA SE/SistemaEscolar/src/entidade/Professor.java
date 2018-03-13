package entidade;


public class Professor {
    private int id;
    private String professor;
    private String disciplina;
    private String disponibilidade;
    private double hora_aula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getHora_aula() {
        return hora_aula;
    }

    public void setHora_aula(double hora_aula) {
        this.hora_aula = hora_aula;
    }
    
    
}
