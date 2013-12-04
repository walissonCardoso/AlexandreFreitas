/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classesubmarino;

import java.util.Scanner;

/**
 *
 * @author Alexandre Freitas
 */
abstract public class SubmarinoMilitar  extends Submarino{
    
    protected double quantidadeArmamento;
    protected int tripulacao;
    protected int inimigos;
    private Scanner input;
    
    //Constutor Default da Clase Submarino;
    public SubmarinoMilitar(){
        this.quantidadeArmamento = 0.0;
        this.tripulacao = 0;
        this.inimigos = 0;        
        this.input = new Scanner (System.in);
    }
    
    //Construtor Copia da Classe Submarino;
    public SubmarinoMilitar(SubmarinoMilitar sm1){
        this.quantidadeArmamento = sm1.quantidadeArmamento;
        this.tripulacao = sm1.tripulacao;
        this.inimigos = sm1.inimigos;        
        this.input = sm1.input;
    } 
    
    
    @Override
    abstract void atacar();
    @Override
    abstract void codigoSecreto();
    
}
