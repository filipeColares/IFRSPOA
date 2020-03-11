public class Pessoa {
    protected String nome;

    Data data;

    public Pessoa(String nome, Data data) {
        this.nome = nome;
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';
    }
}
