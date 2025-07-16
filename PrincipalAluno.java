import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<AlunoMonitor> monitores = new ArrayList<>();

        monitores.add(new AlunoMonitor("Ana", "2022001", "CI1062"));
        monitores.add(new AlunoMonitor("Bruno", "2022002", "CI1003"));
        monitores.add(new AlunoMonitor("Carla", "2022003", "CI1003"));

        for (AlunoMonitor m : monitores) {
            m.imprimirDados();
        }
    }
}
