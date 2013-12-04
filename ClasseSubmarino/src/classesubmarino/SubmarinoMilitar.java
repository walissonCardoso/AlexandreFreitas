/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classesubmarino;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Freitas
 */
abstract public class SubmarinoMilitar  extends Submarino{
    
    protected double quantidadeArmamento;
    protected int tripulacao;
    protected int inimigos;
    private Scanner input;
    
    //Constutor Default da Clase SubmarinoMilitar;
    public SubmarinoMilitar(){
        this.quantidadeArmamento = 0.0;
        this.tripulacao = 0;
        this.inimigos = 0;        
        this.input = new Scanner (System.in);
    }
    
    //Construtor Copia da Classe SubmarinoMilitar;
    public SubmarinoMilitar(SubmarinoMilitar sm1){
        this.quantidadeArmamento = sm1.quantidadeArmamento;
        this.tripulacao = sm1.tripulacao;
        this.inimigos = sm1.inimigos;        
        this.input = sm1.input;
    }
    
    //Get's e Set's da Classe SubmarinoNuclear;
    public double getQuantidadeArmamento() {
        return quantidadeArmamento;
    }
    public void setQuantidadeArmamento(double quantidadeArmamento) {
        this.quantidadeArmamento = quantidadeArmamento;
    }

    public int getTripulacao() {
        return tripulacao;
    }
    public void setTripulacao(int tripulacao) {
        this.tripulacao = tripulacao;
    }

    public int getInimigos() {
        return inimigos;
    }
    public void setInimigos(int inimigos) {
        this.inimigos = inimigos;
    }
    
    //Metodods da Classe SubmarinoMilitar;
    @Override 
    protected abstract void atacar();
    @Override 
    protected abstract void codigoSecreto();
    
    protected void quantidadeDeInimigosAbatidos(){
        System.out.println("Informe a quantidade de inimigos abatidos: ");
        
        this.inimigos = input.nextInt();
        
        if(inimigos<0){
            this.inimigos = 0;
        }
        
        setInimigos(inimigos);
    }
    
    protected void quantidadeDeTripulantes(){
        System.out.println("Informe a quantidade de tripulantes existente no Submarino: ");
        
        this.tripulacao = input.nextInt();
        
        if(tripulacao<0){
            System.out.println("Nao existe quantidade de pessoas negativas! A alocaçao das pessoas foi para 0.");
            this.tripulacao = 0;        
        }
        else if (tripulacao>50){
             System.out.println("Tem muita gente nesse Submarino! O maximo foi alocado 50.");   
             this.tripulacao = 50;
        }
    }

    protected void mensagemSubmarinoMilitar(){
        mensagemSubmarino();
        JOptionPane.showMessageDialog(null, "\n-> Quantidade de inimigos Abatidos: " + getInimigos() + " inimigos." + "\n-> Tripulaçao: " + getTripulacao() + " marujos");
    }
}

