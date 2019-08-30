
/**
 * Escreva a descrição da classe Porta aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Porta extends Abertura
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    boolean status; // status true porta aberta, status false porta fechada
   
    public Porta(String material, double altura, double largura){
        super(material, altura, largura);
    }
   
    
    public Porta(Porta portaASerCopiada){
        super(material, altura, largura);
    }
    public void abrir()
    {
        
        if (status == true) {
            System.out.println("A porta já está aberta");
        } else {
            status = true;
            System.out.println("A porta foi aberta agora");
        }

    }
    
     
    public void fechar()
    {
        
        if (status == false) {
            System.out.println("A porta já está fechada");
        } else {
            status = false;
            System.out.println("A porta foi fechada agora");
        }
    }
    
    // Não pode mudar essa assinatura !!!!
    public String toString() {
        String saida = "Material = " + this.material +
                       "\nCor = " + this.cor +
                       "\nAltura = " + this.altura + 
                       "\nLargura = " + this.largura;
        return saida;
    }
    
}
