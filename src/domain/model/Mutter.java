package domain.model;

public class Mutter extends VerwaltungsElement{
    private String nenndurchmesser;
    public Mutter(int id, String name, Lagerplatz lagerplatz, String nenndurchmesser){
        super(id, name, Kategorie.MUTTER, lagerplatz);
        this.nenndurchmesser = nenndurchmesser;
    }
    public Mutter(int id, String name, String nenndurchmesser){
        super(id, name, Kategorie.MUTTER);
        this.nenndurchmesser = nenndurchmesser;
    }


    public String getNenndurchmesser() {
        return nenndurchmesser;
    }

    public void setNenndurchmesser(String nenndurchmesser) {
        this.nenndurchmesser = nenndurchmesser;
    }
}
