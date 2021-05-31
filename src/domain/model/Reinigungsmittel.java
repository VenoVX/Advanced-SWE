package domain.model;

public class Reinigungsmittel extends VerwaltungsElement{
    public Reinigungsmittel(int id, String name, Lagerplatz lagerplatz){
        super(id, name, Kategorie.REINIGUNGSMITTEL, lagerplatz);
    }
    public Reinigungsmittel(int id, String name){
        super(id, name, Kategorie.REINIGUNGSMITTEL);
    }
}
