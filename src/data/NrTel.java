package data;

import java.io.Serializable;

/**
 *
 * @author gabrieliordache
 */
public abstract class NrTel implements Comparable<NrTel>, Serializable {

    public String nrTelefon;

    public NrTel(String nrTelefon) {
        //System.out.println("Creating NrTel: " + nrTelefon);
        if (validareNumar(nrTelefon)) {
            this.nrTelefon = nrTelefon;
        }

    }

    public abstract boolean validareNumar(String n);

    public boolean equals(NrTel o) {
        return nrTelefon.equals(o.nrTelefon);
        
    }
    @Override
    public int compareTo(NrTel o){
        return nrTelefon.compareTo(o.nrTelefon);
    }

    @Override
    public String toString() {
        return nrTelefon;
    }

}
