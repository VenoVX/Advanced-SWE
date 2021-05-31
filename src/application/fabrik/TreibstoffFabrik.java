package application.fabrik;

import application.Referenz;
import application.manager.LagerplatzManager;
import application.manager.ReinigungsmittelManager;
import application.manager.TreibstoffManager;
import domain.model.Kategorie;
import domain.model.Reinigungsmittel;
import domain.model.Treibstoff;
import domain.model.TreibstoffArt;

public class TreibstoffFabrik implements Fabrik{
    private Referenz ref;
    private TreibstoffManager treibstoffManager;
    private LagerplatzManager lagerplatzManager;
    private TreibstoffFabrik treibstoffFabrikSingleton = new TreibstoffFabrik();
    private TreibstoffFabrik(){
        treibstoffManager = TreibstoffManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public TreibstoffFabrik getInstance(){
        return treibstoffFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        treibstoffManager.add(new Treibstoff(Integer.parseInt(attributes[0]), attributes[1], TreibstoffArt.geEnumOfId(attributes[3])));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(treibstoffManager.get(ref.getRefObject()));
            treibstoffManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
