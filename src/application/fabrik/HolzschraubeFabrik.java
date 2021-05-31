package application.fabrik;

import application.Referenz;
import application.manager.HolzschraubeManager;
import application.manager.LagerplatzManager;
import domain.model.Holzschraube;
import domain.model.Schraubenkopf;

public class HolzschraubeFabrik implements Fabrik{
    private Referenz ref;
    private HolzschraubeManager holzschraubeManager;
    private LagerplatzManager lagerplatzManager;
    private HolzschraubeFabrik holzschraubeFabrikSingleton = new HolzschraubeFabrik();
    private HolzschraubeFabrik(){
        holzschraubeManager = HolzschraubeManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public HolzschraubeFabrik getInstance(){
        return holzschraubeFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[3]));
        holzschraubeManager.add(new Holzschraube(Integer.parseInt(attributes[0]), attributes[1], Schraubenkopf.geEnumOfId(attributes[2]), Double.parseDouble( attributes[4]), Double.parseDouble( attributes[5]), Double.parseDouble( attributes[6])));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(holzschraubeManager.get(ref.getRefObject()));
            holzschraubeManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
