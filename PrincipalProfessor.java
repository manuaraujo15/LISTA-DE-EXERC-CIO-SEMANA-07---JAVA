import java.util.LinkedList;
import java.util.Scanner;

public class PrincipalProfessor {
    public static void main(String[] args) {
        LinkedList<Professor> professores = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        professores.add(new Professor("Daniel", "P001"));
        professores.add(new Professor("Érica", "P002"));
        professores.add(new Professor("Fernando", "P003"));
        professores.add(new Professor("Gustavo", "P004"));
        professores.add(new Professor("Helena", "P005"));

        System.out.print("Digite matrícula do professor para remover: ");
        String matricula = sc.nextLine();

        boolean removido = professores.removeIf(p -> p.getMatricula().equals(matricula));

        if (removido) {
            System.out.println("Professor removido com sucesso!");
        } else {
            System.out.println("Professor não encontrado.");
        }

        System.out.println("\nLista atual de professores:");
        for (Professor p : professores) {
            p.imprimirDados();
        }

        sc.close();
    }
}
