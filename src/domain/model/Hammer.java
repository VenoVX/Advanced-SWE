package domain.model;

public class Hammer extends VerwaltungsElement{
    public Hammer(int id, String name, Lagerplatz lagerplatz){
        super(id, name, Kategorie.Hammer, lagerplatz);
    }
    public Hammer(int id, String name){
        super(id, name, Kategorie.Hammer);
    }
}
