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
public class NumeException extends RuntimeException{

    private String nume;

    public String getNume() {
        return nume;
    }

    public NumeException(String nume, String msg) {
        super(msg);
        this.nume = nume;

    }

}
