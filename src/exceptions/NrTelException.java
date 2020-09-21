/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author gabrieliordache
 */
public class NrTelException extends RuntimeException {
    private String nrTelefon;

    public String getNrTelefon() {
        return nrTelefon;
    }
    
    public NrTelException (String nrTelefon, String msg){
        super(msg);
        this.nrTelefon = nrTelefon;
        
    }
    
   
    
}
