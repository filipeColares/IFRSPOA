public class Curso {
    /**
     * Atributos da classe
     */
    private String nome;
    private double duracao;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private Data data;

    public Curso(String nome, double duracao, Data data) {
        this.nome = nome;
        this.duracao = duracao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    public void imprimir(){

    }
}
