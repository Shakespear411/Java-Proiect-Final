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
public class NrMobil extends NrTel implements Serializable {

    public NrMobil(String n) {
        super(n);

    }

    @Override
    public boolean validareNumar(String nrMobil) {
        if (nrMobil.length() != 10) {
            throw new NrTelException(nrMobil, "Numarul trebuie sa aiba 10 cifre.");
        }
        if (!nrMobil.substring(0, 2).equals("07")) {
            throw new NrTelException(nrMobil, "Numarul trebuie sa inceapa cu '07'.");

        }
        if (!isNo(nrMobil)) {
            throw new NrTelException(nrMobil, "Numarul trebuie sa fie format din cifre.");
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
