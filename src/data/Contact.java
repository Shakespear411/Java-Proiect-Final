package data;

import exceptions.DataException;
import exceptions.NumeException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrieliordache
 */
public class Contact implements Serializable{

    private String nume;
    private String prenume;
    private String dob;
    private LocalDate ld;
    private NrTel nrTelefon;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setDob(String dob) {
        if (isData(dob)) {
            this.dob = dob;
        }
    }

    public void setNrTelefon(NrTel nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDob() {
        return dob;
    }

    public NrTel getNrTelefon() {
        return nrTelefon;
    }

    public LocalDate getData() {
        String data = getDob();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate ld = LocalDate.parse(data, dt);
        return ld;
    }

    public void setLD(LocalDate ld) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate d;
        if (isData(this.dob)) {
            d = LocalDate.parse(dob, dt);
        }
        d = ld;
    }

    public LocalDate getLd() {
        return ld;
    }

    public Contact(String nume, String prenume, String dob, NrTel nrTelefon) {
        if (validareNume(nume)) {
            this.nume = nume;
        }

        if (validarePrenume(prenume)) {
            this.prenume = prenume;
        }

        if (validareData(dob)) {
            this.dob = dob;
        }
        this.nrTelefon = nrTelefon;

    }

    //Validare nume
    public boolean validareNume(String nume) {
        if (nume.length() < 2) {
            throw new NumeException(nume, "Numele trebuie sa aiba cel putin 2 litere.");
        }
        if (!isNume(nume)) {
            throw new NumeException(nume, "Nume invalid. Trebuie sa contina litere.");
        }
        return true;
    }

    public boolean isNume(String nm) {
        boolean result = true;
        for (int i = 0; i < nm.length(); i++) {
            if (!Character.isLetter(nm.charAt(i))) {
                result = false;
            }
        }
        return result;

    }

    //Validare prenume
    public boolean validarePrenume(String prenume) {
        if (prenume.length() < 2) {
            throw new NumeException(prenume, "Prenumele trebuie sa aiba cel putin 2 litere.");
        }
        if (!isPrenume(prenume)) {
            throw new NumeException(prenume, "Prenume invalid. Trebuie sa contina litere.");
        }
        return true;
    }

    public boolean isPrenume(String pnm) {
        boolean result = true;
        for (int i = 0; i < pnm.length(); i++) {
            if (!Character.isLetter(pnm.charAt(i))) {
                result = false;
            }
        }
        return result;

    }

    //Validare data
    public boolean validareData(String dob) {
        if (!isData(dob)) {
            throw new DataException(dob, "Data invalida. Trebuie respectat formatul ZZ.LL.AAAA");
        }
        return true;
    }

    public boolean isData(String dataNastere) {
        if (dataNastere.trim().equals("")) {
            return false;

        } else {

            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            try {
                LocalDate d = LocalDate.parse(dataNastere, dt);
            } catch (DateTimeParseException e) {
                return false;
            }
            return true;
        }
    }

    public boolean equals(Contact c) {
        return (nume.equals(c.nume)) && (prenume.equals(c.prenume)) && (dob.equals(c.dob)) && (nrTelefon.equals(c.nrTelefon));
    }

    @Override
    public String toString() {
        return nume.substring(0, 1).toUpperCase() + nume.substring(1).toLowerCase() + " "
                + prenume.substring(0, 1).toUpperCase() + prenume.substring(1).toLowerCase() + ", " + nrTelefon + ", " + dob;
    }
}
