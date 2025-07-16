import java.util.*;

public class PrincipalPersonagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Personagem> personagens = new TreeSet<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite nome, nível e força base:");
            String nome = sc.nextLine();
            int nivel = Integer.parseInt(sc.nextLine());
            double forca = Double.parseDouble(sc.nextLine());

            switch (i % 3) {
                case 0 -> personagens.add(new Guerreiro(nome, nivel, forca));
                case 1 -> personagens.add(new Mago(nome, nivel, forca));
                case 2 -> personagens.add(new Arqueiro(nome, nivel, forca));
            }
        }

        System.out.println("\n--- Lista de Personagens por Dano (descendente) ---");
        for (Personagem p : personagens) {
            System.out.printf("%s - Dano: %.2f\n", p.getNome(), p.calcularDano());
        }

        sc.close();
    }
}
