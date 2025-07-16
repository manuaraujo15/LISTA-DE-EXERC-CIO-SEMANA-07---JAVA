public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    @Override
    public double calcularDano() {
        return (forcaBase * nivel) + 15;
    }
}
