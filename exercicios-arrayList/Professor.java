public class Professor {
    private String nome;
    private String titulacao;
    private String departamento;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();

    Professor (String nome, String titulacao, String departamento) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.departamento = departamento;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return this.listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.add(disciplina);
    }
}