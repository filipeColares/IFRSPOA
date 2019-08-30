
/**
 * Escreva a descrição da classe Abertura aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public abstract class Abertura
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public String material;
    public String cor;
    public double altura;
    public double largura;
    
    public Abertura(String material, double altura, double largura){
        this.material = material;
        this.altura = altura;
        this.largura = largura;
    }
    
    public Abertura(aberturaASerCopiada){
        this.material = material;
        this.altura = altura;
        this.largura = largura;    
    }
    
    public void pintar(String cor){
        this.cor = cor;
    }
    
    public abstract void abrir();
    
    public abstract void fechar();
    
    
    public String toString(){
        return("IOLO");
    }
}
