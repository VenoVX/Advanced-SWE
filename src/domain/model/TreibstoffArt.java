package domain.model;

public enum TreibstoffArt {
    BENZIN("Benzin"),
    Diesel("Diesel");
    private String typ;

    TreibstoffArt(String typ){
        this.typ = typ;
    }
    public static TreibstoffArt geEnumOfId(String id){
        for(TreibstoffArt ta : values()){
            if(ta.typ.equals(id)){
                return ta;
            }
        }
        return null;
    }
}
