package domain.model;

public class Schraubendreher extends VerwaltungsElement{
    private Schraubenkopf sk;
    public Schraubendreher(int id, String name, Lagerplatz lagerplatz, Schraubenkopf sk){
        super(id, name, Kategorie.SchraubenDreher, lagerplatz);
        this.sk = sk;
    }
    public Schraubendreher(int id, String name, Schraubenkopf sk){
        super(id, name, Kategorie.SchraubenDreher);
        this.sk = sk;
    }

    public Schraubenkopf getSk() {
        return sk;
    }

    public void setSk(Schraubenkopf sk) {
        this.sk = sk;
    }
}
