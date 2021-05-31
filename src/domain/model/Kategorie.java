package domain.model;

public enum Kategorie {
    SCHRAUBE("Schraube"),
    HOLZSCHRAUBE("Holzschraube"),
    METALLSCHRAUBE("Metallschraube"),
    Nagel("Nagel"),
    BOHRMASCHINE("Bohrmaschine"),
    SchraubenDreher("Schraubendreher"),
    MUTTER("Muttern"),
    REINIGUNGSMITTEL("Reinigungsmittel"),
    TREIBSTOFF("Treibstoff"),
    LAGERPLATZ("Lagerplatz"),
    Hammer("Hammer");


    private String typ;
    Kategorie(String typ){
        this.typ = typ;
    }
    public static Kategorie geEnumOfId(String id){
        for(Kategorie k : values()){
            if(k.typ.equals(id)){
                return k;
            }
        }
        return null;
    }
}
