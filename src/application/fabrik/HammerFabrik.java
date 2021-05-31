package application.fabrik;

import application.Referenz;
import application.manager.HammerManager;
import application.manager.LagerplatzManager;
import domain.model.Hammer;

public class HammerFabrik implements Fabrik{
    private Referenz ref;
    private HammerManager hammerManager;
    private LagerplatzManager lagerplatzManager;
    private HammerFabrik  hammerFabrikSingleton = new HammerFabrik();

    private HammerFabrik(){
        hammerManager = hammerManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public HammerFabrik getInstance(){
        return hammerFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        hammerManager.add(new Hammer(Integer.parseInt(attributes[0]), attributes[1]));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(hammerManager.get(ref.getRefObject()));
            hammerManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
