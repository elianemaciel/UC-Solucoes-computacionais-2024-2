public class Principal {

    public static void main() {
        Professor prof = new Professor("João", "Mestre", "Informática");

        Disciplina disp1 = new Disciplina("001", "Programação", 80);
        prof.adicionarDisciplina(disp1);
    }
}