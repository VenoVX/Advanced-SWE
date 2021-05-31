package application;

public class Referenz {
    private int refObject;
    private int lagerPlatz;
    public Referenz(int refObject, int lagerPlatz){
        this.refObject = refObject;
        this.lagerPlatz = lagerPlatz;
    }

    public int getRefObject() {
        return refObject;
    }

    public void setRefObject(int refObject) {
        this.refObject = refObject;
    }

    public int getLagerPlatz() {
        return lagerPlatz;
    }

    public void setLagerPlatz(int lagerPlatz) {
        this.lagerPlatz = lagerPlatz;
    }
}
