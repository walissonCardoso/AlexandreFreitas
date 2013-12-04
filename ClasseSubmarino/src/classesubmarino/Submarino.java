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
public abstract class Submarino {
   
    protected double profundidade;
    protected double latitude;
    protected double longitude;
    protected String modelo; 
    private Scanner input;
    
    public double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Constutor Default da Clase Submarino;
    public Submarino(){
        this.profundidade = 0;
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.modelo = "NULL";        
        this.input = new Scanner (System.in);
    }
    
    //Construtor Copia da Classe Submarino;
    public Submarino(Submarino s1){
        this.profundidade = s1.profundidade;
        this.latitude = s1.latitude;
        this.longitude = s1.longitude;
        this.modelo = s1.modelo;        
        this.input = s1.input;
    } 

    //Metodos da Classe Submarino;
    protected abstract void codigoSecreto();
    protected abstract void atacar();
    
    protected void profundidadeSubmarino(){
        System.out.println("\nQual a profundidade do Submarino: ");
        
        this.profundidade = input.nextDouble();
        
        setProfundidade(profundidade);
    }

    protected void modelo(){
        System.out.println("\nQual o modelo do Submarino: ");
        
        this.modelo = input.next();
        
        setModelo(modelo);
    }

    protected void coordenadas(){
        System.out.println("\nIndique as coordenadas do Submarino: \n");
    
        System.out.println("Informe a Latitude: ");
        this.latitude = input.nextDouble();
        setLatitude(latitude);
        
        System.out.println("\nInforme a Longitude: ");
        this.longitude = input.nextDouble();
        setLatitude(longitude);
                
    }

    protected void mensagemSubmarino(){
        JOptionPane.showMessageDialog(null,"-> Modelo do Submarino: " + getModelo() + "\n-> Profundidade do Submarino: " + getProfundidade() + " metros" 
                                                + "\n-> Coordenadas do Submarino: [" + getLatitude() + "," + getLongitude() + "]");
        
    }
}
