/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enis Lushtaku
 */
@XmlRootElement
public class Adresse
{
    private String strasse;
    private int hausnummer;
    private int stock;
    private int tuer;
    private int plz;
    private String stadt;

    public Adresse()
    {
    }

    public Adresse(String strasse, int hausnummer, int stock, int tuer, int plz, String stadt)
    {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.stock = stock;
        this.tuer = tuer;
        this.plz = plz;
        this.stadt = stadt;
    }

    public String getStrasse()
    {
        return strasse;
    }

    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }

    public int getHausnummer()
    {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer)
    {
        this.hausnummer = hausnummer;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public int getTuer()
    {
        return tuer;
    }

    public void setTuer(int tuer)
    {
        this.tuer = tuer;
    }

    public int getPlz()
    {
        return plz;
    }

    public void setPlz(int plz)
    {
        this.plz = plz;
    }

    public String getStadt()
    {
        return stadt;
    }

    public void setStadt(String stadt)
    {
        this.stadt = stadt;
    }
    
    
}
