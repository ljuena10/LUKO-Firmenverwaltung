/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@XmlRootElement
public class Person
{
    private String vorname;
    private String nachname;
    private Date geburtsdatum;
    private Adresse adresse;
    private int telefonnummer;

    public Person()
    {
    }

    public Person(String vorname, String nachname, Date geburtsdatum, Adresse adresse, int telefonnummer)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }

    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public Date getGeburtsdatum()
    {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum)
    {
        this.geburtsdatum = geburtsdatum;
    }

    public Adresse getAdresse()
    {
        return adresse;
    }

    public void setAdresse(Adresse adresse)
    {
        this.adresse = adresse;
    }

    public int getTelefonnummer()
    {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer)
    {
        this.telefonnummer = telefonnummer;
    }
    
    
}
