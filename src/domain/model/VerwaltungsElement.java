package domain.model;

public class VerwaltungsElement {
    private Lagerplatz lagerplatz;
    private int id;
    private String name;
    private Kategorie kategorie;
    public VerwaltungsElement(int id, String name, Kategorie k, Lagerplatz lagerplatz){
        this.id = id;
        this.name = name;
        this.kategorie = k;
        this.lagerplatz = lagerplatz;
    }
    public VerwaltungsElement(int id, String name, Kategorie k)
    {
        this.id = id;
        this.name = name;
        this.kategorie = k;
    }

    public Lagerplatz getLagerplatz() {
        return lagerplatz;
    }

    public void setLagerplatz(Lagerplatz lagerplatz) {
        this.lagerplatz = lagerplatz;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Kategorie getKategorie() {
        return kategorie;
    }
    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }
}
