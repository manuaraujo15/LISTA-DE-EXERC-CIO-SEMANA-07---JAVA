public class AlunoMonitor {
    private String nome;
    private String matricula;
    private String codDisciplina;

    public AlunoMonitor(String nome, String matricula, String codDisciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.codDisciplina = codDisciplina;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplina: " + codDisciplina);
        System.out.println();
    }
}
