package application.fabrik;

import application.Referenz;
import application.manager.HolzschraubeManager;
import application.manager.LagerplatzManager;
import application.manager.MetallschraubeManager;
import domain.model.Holzschraube;
import domain.model.Metallschraube;
import domain.model.Schraubenkopf;

public class MetallschraubeFabrik implements Fabrik{
    private Referenz ref;
    private MetallschraubeManager metallschraubeManager;
    private LagerplatzManager lagerplatzManager;
    private MetallschraubeFabrik metallschraubeFabrikSingleton = new MetallschraubeFabrik();
    private MetallschraubeFabrik(){
        metallschraubeManager = MetallschraubeManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public MetallschraubeFabrik getInstance(){
        return metallschraubeFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[3]));
        metallschraubeManager.add(new Metallschraube(Integer.parseInt(attributes[0]), attributes[1], Schraubenkopf.geEnumOfId(attributes[2]), Double.parseDouble( attributes[4]), Double.parseDouble( attributes[5]), Double.parseDouble( attributes[6])));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(metallschraubeManager.get(ref.getRefObject()));
            metallschraubeManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
