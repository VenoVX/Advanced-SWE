package domain.model;

public class Treibstoff extends VerwaltungsElement{
    private TreibstoffArt ta;
    public Treibstoff(int id, String name, Lagerplatz lagerplatz, TreibstoffArt ta){
        super(id, name, Kategorie.TREIBSTOFF, lagerplatz);
        this.ta = ta;
    }
    public Treibstoff(int id, String name, TreibstoffArt ta){
        super(id, name, Kategorie.TREIBSTOFF);
        this.ta = ta;
    }

    public TreibstoffArt getTa() {
        return ta;
    }

    public void setTa(TreibstoffArt ta) {
        this.ta = ta;
    }
}
