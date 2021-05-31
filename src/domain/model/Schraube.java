package domain.model;

public class Schraube extends VerwaltungsElement{
    private double kopfhoehe;
    private double gewindelaenge;
    private double kopfdurchmesser;
    private Schraubenkopf sk;
    public Schraube(int id, String name, Kategorie k, Lagerplatz lagerplatz, Schraubenkopf sk, double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, k, lagerplatz);
        this.sk = sk;
        this.kopfhoehe = kopfhoehe;
        this.gewindelaenge = gewindelaenge;
        this.kopfdurchmesser = kopfdurchmesser;
    }
    public Schraube(int id, String name, Kategorie k, Schraubenkopf sk, double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, k);
        this.sk = sk;
        this.kopfhoehe = kopfhoehe;
        this.gewindelaenge = gewindelaenge;
        this.kopfdurchmesser = kopfdurchmesser;
    }

    public double getKopfhoehe() {
        return kopfhoehe;
    }

    public void setKopfhoehe(double kopfhoehe) {
        this.kopfhoehe = kopfhoehe;
    }

    public double getGewindelaenge() {
        return gewindelaenge;
    }

    public void setGewindelaenge(double gewindelaenge) {
        this.gewindelaenge = gewindelaenge;
    }

    public double getKopfdurchmesser() {
        return kopfdurchmesser;
    }

    public void setKopfdurchmesser(double kopfdurchmesser) {
        this.kopfdurchmesser = kopfdurchmesser;
    }

    public Schraubenkopf getSk() {
        return sk;
    }
    public void setSk(Schraubenkopf sk) {
        this.sk = sk;
    }
}
