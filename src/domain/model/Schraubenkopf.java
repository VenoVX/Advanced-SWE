package domain.model;

public enum Schraubenkopf {
    KOPF_SCHLITZ("Kopf-Schlitz"),
    KOPF_KREUZ_SCHLITZ("Kopf-Kreuzschlitz"),
    AUSSEN_SECHS_KANT("Außen-Sechskant"),
    INNEN_SECHS_KANT("Innen-Sechskant"),
    INNEN_SECHS_RUND("Innen-Sechsrund"),
    AUSSEN_VIERKANT("Außen-Vierkant");


    private String typ;
    Schraubenkopf(String typ){
        this.typ = typ;
    }
    public static Schraubenkopf geEnumOfId(String id){
        for(Schraubenkopf s : values()){
            if(s.typ.equals(id)){
                return s;
            }
        }
        return null;
    }
}
