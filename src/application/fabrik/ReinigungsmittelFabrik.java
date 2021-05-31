package application.fabrik;

import application.Referenz;
import application.manager.BohrmaschineManager;
import application.manager.LagerplatzManager;
import application.manager.ReinigungsmittelManager;
import domain.model.Bohrmaschine;
import domain.model.Reinigungsmittel;

public class ReinigungsmittelFabrik implements Fabrik{
    private Referenz ref;
    private ReinigungsmittelManager reinigungsmittelManager;
    private LagerplatzManager lagerplatzManager;
    private ReinigungsmittelFabrik reinigungsmittelFabrikSingleton = new ReinigungsmittelFabrik();
    private ReinigungsmittelFabrik(){
        reinigungsmittelManager = ReinigungsmittelManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public ReinigungsmittelFabrik getInstance(){
        return reinigungsmittelFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        reinigungsmittelManager.add(new Reinigungsmittel(Integer.parseInt(attributes[0]), attributes[1]));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(reinigungsmittelManager.get(ref.getRefObject()));
            reinigungsmittelManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
