package domain.model;

public class Metallschraube extends Schraube{
    public Metallschraube(int id, String name, Schraubenkopf sk, Lagerplatz lagerplatz,  double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, Kategorie.METALLSCHRAUBE, lagerplatz, sk, kopfhoehe, gewindelaenge, kopfdurchmesser);
    }
    public Metallschraube(int id, String name, Schraubenkopf sk,  double kopfhoehe, double gewindelaenge, double kopfdurchmesser){
        super(id, name, Kategorie.METALLSCHRAUBE, sk, kopfhoehe, gewindelaenge, kopfdurchmesser);
    }

}
