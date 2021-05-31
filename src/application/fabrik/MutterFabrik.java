package application.fabrik;

import application.Referenz;
import application.manager.BohrmaschineManager;
import application.manager.LagerplatzManager;
import application.manager.MutterManager;
import domain.model.Bohrmaschine;
import domain.model.Mutter;

public class MutterFabrik implements Fabrik{
    private Referenz ref;
    private MutterManager mutterManager;
    private LagerplatzManager lagerplatzManager;
    private MutterFabrik mutterFabrikSingleton = new MutterFabrik();
    private MutterFabrik(){
        mutterManager = MutterManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public MutterFabrik getInstance(){
        return mutterFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        mutterManager.add(new Mutter(Integer.parseInt(attributes[0]), attributes[1], attributes[3]));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(mutterManager.get(ref.getRefObject()));
            mutterManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
