import java.util.List;

public class Funcionario extends Pessoa{

    private long matricula;
    private char situacao;
    private double valorHora;
    private double numHoras;
    private boolean abono = false;

    private List<Telefone> telefone;

    public Funcionario(String nome, Data data, long matricula, char situacao, double valorHora, double numHoras, boolean abono, List<Telefone> telefone) {
        super(nome, data);
        this.matricula = matricula;
        this.situacao = situacao;
        this.valorHora = valorHora;
        this.numHoras = numHoras;
        this.abono = abono;
        this.telefone = telefone;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public boolean isAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }



    @Override
    public String toString() {
        String aux = "1";
        //coloca um telefone abaixo do outro

        for(Telefone t : telefone){
            aux = aux + "\n" + telefone.toString();
        }
        aux = aux + "\n" + super.toString();
        aux = aux + "\n" + matricula + situacao + valorHora + numHoras + abono + situacao;

        return aux;
    }

    public double calculaSalario(){

        double salario = numHoras*valorHora;

        if (abono)
            salario = salario*1.1;

        return salario;
    }
}
