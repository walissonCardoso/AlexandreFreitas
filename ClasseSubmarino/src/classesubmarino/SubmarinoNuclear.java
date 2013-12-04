
package classesubmarino;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Freitas
 */
public class SubmarinoNuclear extends SubmarinoMilitar{
    
    //Atributos da Classe SubmarinoNuclear;
    private String tipoArma;
    private Scanner input;

    public String getTipoArma() {
        return tipoArma;
    }
    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
    
    //Constutor Default da Clase SubmarinoNuclear;
    public SubmarinoNuclear(){
        this.tipoArma = "NULL";        
        this.input = new Scanner (System.in);
    }
    
    //Construtor Copia da Classe SubmarinoNuclear;
    public SubmarinoNuclear(SubmarinoNuclear sn1){
        this.tipoArma = sn1.tipoArma;        
        this.input = sn1.input;
    }
    
    //Metodos da Classe SubmarinoNuclear;
    @Override
    protected void atacar() {
        
        tipoDeArmaNuclear();
        JOptionPane.showMessageDialog(null, "Submarino Nuclear pronto pra atacar!");
    
    }

    @Override
    protected void codigoSecreto() {
        char n = 'n';
        
        Random rand = new Random();
        String aux = ""+n; 
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
    
        JOptionPane.showMessageDialog(null, "\nCodigo secreto do Submarino Nuclear: " + aux);
    }
    
    protected void tipoDeArmaNuclear(){
        System.out.println("\nQual tipo de Bomba Nuclear esta no Submarino: ");
        
        this.tipoArma = input.next();
        
        if (tipoArma.equalsIgnoreCase("atomica") && tipoArma.equalsIgnoreCase("hidrogenio")){
            JOptionPane.showMessageDialog(null, "Submarino Carregado!");
        } 
        else JOptionPane.showMessageDialog(null,"Os tipos de Bombas que podem ser carregadas sao: Atomica ou Hidrogenio");
    
        setTipoArma(tipoArma);
    }   
    
    protected void ligarAlertaNuclear(){
        
        String resposta;
        int vidaSubmarino;
        
        JOptionPane.showMessageDialog(null,"Alerta de Ataque Ligado!!!");
        
        System.out.println("\nCapitao voce que lutar ou quer fugir?");
        resposta = input.next();
        
        System.out.println("\nInforme o valor da vida do Submarino Nuclear (entre 0 e 100)");
        vidaSubmarino = input.nextInt();
        
        if(resposta.equalsIgnoreCase("Lutar")){
            Random rand = new Random();
            int poderAtaque = rand.nextInt(100);
                if(vidaSubmarino>poderAtaque){
                    JOptionPane.showMessageDialog(null,"Luta vencida...!!!");
                }else if (vidaSubmarino<poderAtaque){
                            JOptionPane.showMessageDialog(null,"Menos um Submarino Nuclear..!!!");
                      }
        } else if(resposta.equalsIgnoreCase("Fugir")){
                    JOptionPane.showMessageDialog(null,"Nao foi desta vez que teve uma Luta... Fugimos...!!!");
                }
    }
    
    public void mensagemSubmarinoNuclear(){
        mensagemSubmarinoMilitar();
        JOptionPane.showMessageDialog(null,"->Tipo de arma nuclear usada: " + getTipoArma());
    }
}