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
public class Abbigliamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TipoCapoAbigliamento t= new TipoCapoAbigliamento ("nike", "tuta", 13.56);
        System.out.println("Sconto applicato ="+t.applicaSconto(30));
        //System.out.println ("il costo inizia è "+t.getCosto);
        t.getCosto();
        System.out.println("il costo modificato è"+t.modificaCosto(15.99));
        
    }
    
}
