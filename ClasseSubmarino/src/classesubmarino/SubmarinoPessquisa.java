

package classesubmarino;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Freitas
 */
public class SubmarinoPessquisa extends SubmarinoMilitar {
 
     //Atributos da Classe SubmarinoDePesquisa;
    private String tipoPesquisa;
    private Scanner input;

    public String getTipoPesquisa() {
        return tipoPesquisa;
    }
    public void setTipoPesquisa(String tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }

    //Constutor Default da Clase SubmarinoDePesquisa;
    public SubmarinoPessquisa(){
        this.tipoPesquisa = "NULL";        
        this.input = new Scanner (System.in);
    }
    
    //Construtor Copia da Classe SubmarinoDePesquisa;
    public SubmarinoPessquisa(SubmarinoPessquisa sp1){
        this.tipoPesquisa = sp1.tipoPesquisa;        
        this.input = sp1.input;
    }
    
    //Metodos da Classe SubmarinoDePesquisa;
    @Override
    protected void atacar() {
        JOptionPane.showMessageDialog(null, "Sorry!!! Este Submarino nao ataca... Vá para outro...");
    }
    
    @Override
    protected void codigoSecreto() {
        char p = 'p';
        
        Random rand = new Random();
        String aux = ""+p; 
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
        aux += rand.nextInt(9);
        
        JOptionPane.showMessageDialog(null, "\nCodigo secreto do navio de pesquisa: " + aux);
    }
    
    protected void tipoDePesquisa(){
        System.out.println("\nQual tipo de pesquisa o Submarino de Pesquisa ira realizar: ");
        
        this.tipoPesquisa = input.next();
        
        if (tipoPesquisa.equalsIgnoreCase("area") && tipoPesquisa.equalsIgnoreCase("inimigos")){
            JOptionPane.showMessageDialog(null,"OK... Submarino de Pesquisa atuando em alguma pesquisa!"); 
        } 
        else JOptionPane.showMessageDialog(null,"Os tipos de Pesquisa que podem ser realizadas sao: Area ou Inimigos.");
    
        setTipoPesquisa(tipoPesquisa);
    }
    
    public void mensagemSubmarinoDePesquisa(){
        mensagemSubmarinoMilitar();
        JOptionPane.showMessageDialog(null,"->Tipo de pesquisa: " + getTipoPesquisa());
    }
}