/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import exceptions.NrTelException;
import java.io.Serializable;

/**
 *
 * @author gabrieliordache
 */
public class NrFix extends NrTel implements Serializable {
    public NrFix (String n) {
        super(n);

    }

    @Override
    public boolean validareNumar(String nrFix) {
        if (nrFix.length() != 10) {
            throw new NrTelException(nrFix, "Numarul trebuie sa aiba 10 cifre.");
        }
        //System.out.println("Validating : " + nrFix);
        //System.out.println(nrFix.substring(0, 2));
        //System.out.println(!nrFix.substring(0, 2).equals("02") || !nrFix.substring(0, 2).equals("03"));
        if (!nrFix.substring(0, 2).equals("02") && !nrFix.substring(0, 2).equals("03")) {
            throw new NrTelException(nrFix, "Numarul trebuie sa inceapa cu '02' sau '03'.");

        }
        if (!isNo(nrFix)) {
            throw new NrTelException(nrFix, "Numarul trebuie sa fie format din cifre.");
        }
        return true;

    }

    public boolean isNo(String no) {
        boolean result = true;
        for (int i = 0; i < no.length(); i++) {
            if (!Character.isDigit(no.charAt(i))) {
                result = false;
            }
        }
        return result;

    }
    
}
