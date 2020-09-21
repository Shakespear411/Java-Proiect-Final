/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import exceptions.ContactExistentException;
import exceptions.DataException;
import exceptions.NrTelException;
import exceptions.NumeException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author gabrieliordache
 */
public class Agenda implements Serializable {

    public Agenda() {
        
        /*ordonareContacte.put(CriteriuOrdonare.DUPA_NUME, (Contact) cDupaNume);
        ordonareContacte.put(CriteriuOrdonare.DUPA_PRENUME, (Contact) cDupaPrenume);
        ordonareContacte.put(CriteriuOrdonare.DUPA_DATA, (Contact) cDupaData);
        ordonareContacte.put(CriteriuOrdonare.DUPA_TELEFON, (Contact) cDupaTelefon);*/
        
    }
    

    public static void main(String[] args) {
        NrTel t = new NrMobil("0730111222");
        Contact n = new Contact("andrei", "gheorghe", "22.04.2000", t);
        //Contact s = new Contact("andrei", "gheorghe", "22.04.2040", t);
        System.out.println(n.toString());
        
        
        
    }

    public List<Contact> colectieContacte = new ArrayList<>();
    public Map<CriteriuOrdonare, Contact> ordonareContacte = new HashMap<>();
    public Predicate<Contact> tipFiltru = (c -> true);
    public Comparator<Contact> criteriuCurent = (c1, c2) -> c1.getNume().compareToIgnoreCase(c2.getNume().toLowerCase());

    public static Comparator<Contact> cDupaNume = (c1, c2) -> c1.getNume().compareToIgnoreCase(c2.getNume().toLowerCase());
    public static Comparator<Contact> cDupaPrenume = (c1, c2) -> c1.getPrenume().compareToIgnoreCase(c2.getPrenume());
    public static Comparator<Contact> cDupaData = (c1, c2) -> c1.getDob().compareTo(c2.getDob());
    public static Comparator<Contact> cDupaTelefon = (c1, c2) -> c1.getNrTelefon().compareTo(c2.getNrTelefon());
    
    public Map<CriteriuOrdonare, Contact> getOrdonareContacte (){
        return ordonareContacte;
    }

    public enum CriteriuOrdonare {
        DUPA_NUME,
        DUPA_PRENUME,
        DUPA_DATA,
        DUPA_TELEFON
    }
    
    public void adaugareContact(Contact c) throws ContactExistentException{
        if(!colectieContacte.contains(c)){
            colectieContacte.add(c);
        }else{
            throw new ContactExistentException("Contact existent. Nu este permisa dublarea contactelor.");
            
        }
    }
    
    public void stergereContact (Contact c) {
        colectieContacte.remove(c);
    }
    
    public void modificareNrTel(Contact c, NrTel t) throws NumeException, DataException, NrTelException{
        colectieContacte.add(new Contact (c.getNume(), c.getPrenume(), c.getDob(), t));
        colectieContacte.remove(c);
    }
    
    //Filtrare//
    
    public void filtreazaNrFix (){
        tipFiltru = (c -> c.getNrTelefon().toString().substring(0, 2).equalsIgnoreCase("02") || 
                          c.getNrTelefon().toString().substring(0, 2).equalsIgnoreCase("03"));
    }
    
    public void filtreazaNrMobil (){
        tipFiltru = (c -> c.getNrTelefon().toString().substring(0, 2).equalsIgnoreCase("07"));
    }
    
    public void filtreazaNascutiAstazi  (){
        tipFiltru = (c -> c.getLd().getDayOfMonth() == LocalDate.now().getDayOfMonth());
    }
    
    public void filtreazaNascutiLunaCurenta (){
        tipFiltru = (c -> c.getLd().getMonth() == (LocalDate.now().getMonth()) && c.getLd().getDayOfMonth() > (LocalDate.now().getDayOfMonth()));
    }
    
    public void filtreazaPersonalizat (String s){
        if (s.matches(" [a-zA-Z]+")){
            tipFiltru = (c -> c.getNume().toLowerCase().contains(s.toLowerCase()) || c.getPrenume().toLowerCase().contains(s.toLowerCase()));
        }else if (s.matches(" [0-9]+ ")){
            tipFiltru = (c -> c.getNrTelefon().toString().contains(s));
        }else{
            tipFiltru = (c -> false);
        }
    }
    
    /*public void ordoneaza (CriteriuOrdonare c){
        criteriuCurent = (Comparator<Contact>) ordonareContacte.get(c);
    }*/
    
    public ArrayList<Contact> contacte(){
        return colectieContacte.stream()
                    .filter(tipFiltru)
                    .sorted(criteriuCurent)
                    .collect(Collectors.toCollection(ArrayList::new));
    }
    

    public void ordoneaza(CriteriuOrdonare a) {
        switch (a) {
            case DUPA_NUME:
                Collections.sort(colectieContacte, cDupaNume);
                System.out.println(colectieContacte);
                break;
            case DUPA_PRENUME:
                Collections.sort(colectieContacte, cDupaPrenume);
                System.out.println(colectieContacte);
                break;
            case DUPA_DATA:
                Collections.sort(colectieContacte, cDupaData);
                System.out.println(colectieContacte);
                break;
            case DUPA_TELEFON:
                Collections.sort(colectieContacte, cDupaTelefon);
                System.out.println(colectieContacte);
                break;
            default:
                break;
        }
    }

}
