
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Principal
{
    public static void main (String[] args) {
       Porta p1 = new Porta("terra");
       Sensor s1 = new Sensor(false);
       
       s1.setPorta(p1);
       s1.ativar();
       s1.desativar();
    }
}
