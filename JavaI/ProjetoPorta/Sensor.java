
/**
 * Escreva a descrição da classe Sensor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Sensor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    boolean presenca;
    Porta porta;
    
    /**
     * COnstrutor para objetos da classe Sensor
     */
    public Sensor(boolean presenca)
    {
        // inicializa variáveis de instância
        this.presenca = presenca;
    }
    
    public void ativar(){
        presenca = true;
        System.out.println("Sensor ativo");
        porta.abrir();
    }
    
    public void desativar(){
        presenca = false;
        System.out.println("Sensor inativo");
        porta.fechar();
    }
    
    public void setPorta(Porta porta){
        this.porta = porta;
    }
}
