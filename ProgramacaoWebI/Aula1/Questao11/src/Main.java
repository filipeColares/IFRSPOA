import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Funcionario> funcionarios = new ArrayList();
        int op = Integer.parseInt(JOptionPane.showInputDialog(montaMenu()));
        switch (op){
            case 1:
                String nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
                long matricula = Long.parseLong(JOptionPane.showInputDialog("Informe a matricula do funcionário: "));
                char situacao = JOptionPane.showInputDialog("Informe a situação do funcionário: ").charAt(0);
                double valorhora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor hora do funcionário: "));
                double numhora = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas do funcionário: "));
                boolean abono = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe se houve abono: "));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do funcionário: "));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês do funcionário: "));
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do funcionário: "));
                int numTelefone = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de telefones: "));

                List<Telefone> telefones = new ArrayList();
                for(int i = 0; i < numTelefone; i++){
                    int ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o ddd do funcionário: "));
                    long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o numero do funcionário: "));
                    telefones.add(new Telefone(ddd, numero));
                }

                Data data = new Data(dia, mes, ano);


                Funcionario funcionario = new Funcionario(nome, data, matricula,situacao, valorhora, numhora, abono, telefones);

                JOptionPane.showMessageDialog(null, funcionario.toString());
                break;

            case 2:
                boolean flag = false;
                nome = JOptionPane.showInputDialog("Informe o nome do funcionário");

                if (!funcionarios.isEmpty()){
                    for (Funcionario func : funcionarios) {
                        if (func.getNome().equals(nome)) {
                            JOptionPane.showMessageDialog(null, "Funcionário Encontrado!");
                            flag = true;
                            break;
                        }
                    }
                }
                if(!flag)
                    JOptionPane.showMessageDialog(null, "Curso não encontrado!");

                break;

            case 3:
                flag = false;
                int ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o ddd do funcionário: "));
                int telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe o telefone do funcionário: "));
                if (!funcionarios.isEmpty()){
                    for (Funcionario func : funcionarios) {
                        List<Telefone> fone = new ArrayList<>();
                        for(Telefone t : fone ){
                            if (t.getDdd() == ddd &&
                                t.getNumero() == telefone) {
                                JOptionPane.showMessageDialog(null, "Funcionário Encontrado!");
                                flag = true;
                                break;
                            }
                        }

                    }
                }
                if(!flag)
                    JOptionPane.showMessageDialog(null, "Curso não encontrado!");

                break;

            case 4: System.exit(0);
        }

    }

    public static String montaMenu() {
        String mnu = "1 – Cadastrar Funcionário\n"
                + "2 – Pesquisar Funcionário por nome\n"
                + "3 – Pesquisar Funcionário por telefone\n"
                + "4 – Sair";
        return mnu;
    }

    public static void cadastrarFuncionario(){


    }

    public static void pesquisarFuncionarioNome(){

    }
}
