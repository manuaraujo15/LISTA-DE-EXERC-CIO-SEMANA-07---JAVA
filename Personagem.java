public abstract class Personagem implements Comparable<Personagem> {
    protected String nome;
    protected int nivel;
    protected double forcaBase;

    public Personagem(String nome, int nivel, double forcaBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.forcaBase = forcaBase;
    }

    public abstract double calcularDano();

    @Override
    public int compareTo(Personagem outro) {
        return Double.compare(outro.calcularDano(), this.calcularDano()); // decrescente
    }

    public String getNome() {
        return nome;
    }
}
