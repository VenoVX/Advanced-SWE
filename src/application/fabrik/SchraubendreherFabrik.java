package application.fabrik;

import application.Referenz;
import application.manager.BohrmaschineManager;
import application.manager.LagerplatzManager;
import application.manager.SchraubendreherManager;
import domain.model.Bohrmaschine;
import domain.model.Schraubendreher;
import domain.model.Schraubenkopf;

public class SchraubendreherFabrik implements Fabrik{
    private Referenz ref;
    private SchraubendreherManager schraubendreherManager;
    private LagerplatzManager lagerplatzManager;
    private SchraubendreherFabrik schraubendreherFabrikSingleton = new SchraubendreherFabrik();
    private SchraubendreherFabrik(){
        schraubendreherManager = SchraubendreherManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public SchraubendreherFabrik getInstance(){
        return schraubendreherFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        schraubendreherManager.add(new Schraubendreher(Integer.parseInt(attributes[0]), attributes[1], Schraubenkopf.geEnumOfId(attributes[3])));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(schraubendreherManager.get(ref.getRefObject()));
            schraubendreherManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
