
package classesubmarino;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Freitas
 */
public class ClasseSubmarino {

    public static void main(String[] args) {
        SubmarinoNuclear sn1 = new SubmarinoNuclear();
        
        JOptionPane.showMessageDialog(null,"Olá capitao do Submarino Nuclear!!!");
        
        sn1.profundidadeSubmarino();
        sn1.modelo();
        sn1.coordenadas();
        
        sn1.quantidadeDeInimigosAbatidos();
        sn1.quantidadeDeTripulantes();
        
        sn1.tipoDeArmaNuclear();
        sn1.atacar();
        sn1.codigoSecreto();
        sn1.mensagemSubmarinoNuclear();
        sn1.ligarAlertaNuclear();
        
        JOptionPane.showMessageDialog(null,"Estamos em outro navio neste momento... Olá capitao do Submarino de Pesquisa!!!");
        
        SubmarinoPessquisa sp1 = new SubmarinoPessquisa();
        
        sp1.profundidadeSubmarino();
        sp1.modelo();
        sp1.coordenadas();
        
        sp1.quantidadeDeInimigosAbatidos();
        sp1.quantidadeDeTripulantes();
        
        sp1.tipoDePesquisa();
        sp1.atacar();
        sp1.codigoSecreto();
        
        sp1.mensagemSubmarinoDePesquisa();
    }
    
}
