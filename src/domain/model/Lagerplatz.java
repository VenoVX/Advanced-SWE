package domain.model;

public class Lagerplatz{

    private int id;
    private VerwaltungsElement zugehörigesElement;
    public Lagerplatz(int id, VerwaltungsElement vE) {
        this.id = id;
        this.zugehörigesElement = vE;
    }
    public Lagerplatz(Integer id){
        this.id = id;
        this.zugehörigesElement = null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VerwaltungsElement getZugehörigesElement() {
        return zugehörigesElement;
    }

    public void setZugehörigesElement(VerwaltungsElement zugehörigesElement) {
        this.zugehörigesElement = zugehörigesElement;
    }
}
