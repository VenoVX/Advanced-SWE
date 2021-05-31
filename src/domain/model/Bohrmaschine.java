package domain.model;

public class Bohrmaschine extends VerwaltungsElement{

    public Bohrmaschine(int id, String name, Lagerplatz lagerplatz){
        super(id, name, Kategorie.BOHRMASCHINE, lagerplatz);
    }
    public Bohrmaschine(int id, String name){
        super(id, name, Kategorie.BOHRMASCHINE);
    }
}
