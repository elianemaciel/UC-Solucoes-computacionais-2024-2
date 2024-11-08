public class Disciplina {
    private String codigo;
    private String nome;
    private int ch;

    public Disciplina(String codigo, String nome, int ch) {
        this.codigo = codigo;
        this.nome = nome;
        this.ch = ch;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return this.ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }
}