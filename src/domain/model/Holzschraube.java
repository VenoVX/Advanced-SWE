package domain.model;

public class Holzschraube extends Schraube{
    public Holzschraube(int id, String name, Schraubenkopf sk, Lagerplatz lagerplatz,  double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, Kategorie.HOLZSCHRAUBE, lagerplatz, sk, kopfhoehe, gewindelaenge, kopfdurchmesser);
    }
    public Holzschraube(int id, String name, Schraubenkopf sk,  double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, Kategorie.HOLZSCHRAUBE, sk, kopfhoehe, gewindelaenge, kopfdurchmesser);
    }
}
