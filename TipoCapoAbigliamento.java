/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abbigliamento;

/**
 *
 * @author Administrator
 */
public class TipoCapoAbigliamento {
    private String marca;
   private String modello;
   private double costo;
    
    public TipoCapoAbigliamento (String marca, String modello, double costo){
    this.costo=costo;
    this.marca=marca;
    this.modello=modello;
    }

   /* public double getCosto() {
        return costo;
    }*/
public void getCosto(){
System.out.println("il costo è"+costo);}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

  
   
    
    public double applicaSconto (double s){
    double prezzo=costo-(costo*(s/100));
    return prezzo;}
    
    public double modificaCosto (double m){
    this.costo=m;
    return costo;
}
    
}
