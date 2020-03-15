/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author pc
 */
public class Producto extends servicio{

    
    public Producto(float costo) {
        
        this.setCosto(costo);
    }

    @Override
    public String toString() {
        return "Aceite relajante";
    }
    
    
}
