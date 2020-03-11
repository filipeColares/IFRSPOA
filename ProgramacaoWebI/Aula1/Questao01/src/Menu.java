import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(montaMenu()));
        switch(opcao) {
            case 1:
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

                Data data = new Data(dia, mes, ano);

                String nome = JOptionPane.showInputDialog("Informe o nome do curso: ");
                double duracao = Double.parseDouble(JOptionPane.showInputDialog("Informe a duração: "));

                cursos.add(new Curso(nome, duracao, data));


                break;
            case 2:
                boolean flag = false;
                String nomeCurso = JOptionPane.showInputDialog("Informe o nome do curso");

                if (!cursos.isEmpty()){
                    for (Curso curso : cursos) {
                        if (curso.getNome().equals(nomeCurso)) {
                            JOptionPane.showMessageDialog(null, "Curso Encontrado!");
                            flag = true;
                            break;
                        }
                    }
                }
                if(!flag)
                    JOptionPane.showMessageDialog(null, "Curso não encontrado!");

                break;

            case 3:

                /**
                 * Pesquisa por data
                 */
                dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês: "));
                ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));

                if (!cursos.isEmpty()){
                    for (Curso curso : cursos) {
                        if (curso.getData().getDia() == dia &&
                                curso.getData().getMes() ==  mes &&
                                curso.getData().getAno() == ano  ) {
                            JOptionPane.showMessageDialog(null, "Curso Encontrado!");
                            flag = true;
                            break;
                        }
                    }
                }

                break;

            case 4:

                /**
                 * Listando todos os cursos
                 */
                for (Curso curso : cursos){
                    JOptionPane.showMessageDialog(null, curso.toString());
                }
                break;

            case 5: System.exit(0);
        }
    }

    public static String montaMenu() {
        String mnu = "1 – Cadastrar Curso\n"
                + "2 – Pesquisar Curso usando o nome\n"
                + "3 – Pesquisar Curso usando a data em que ocorre\n"
                + "4 – Listar todos os cursos\n"
                + "5 – Sair";
        return mnu;
    }
}