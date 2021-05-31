package application.fabrik;

import application.Referenz;
import application.manager.BohrmaschineManager;
import application.manager.LagerplatzManager;
import domain.model.Bohrmaschine;
import domain.model.Lagerplatz;

import java.util.ArrayList;
import java.util.HashMap;

public class BohrMaschineFabrik implements Fabrik{
    private Referenz ref;
    private BohrmaschineManager bohrmaschineManager;
    private LagerplatzManager lagerplatzManager;
    private BohrMaschineFabrik bohrMaschineFabrikSingleton = new BohrMaschineFabrik();
    private BohrMaschineFabrik(){
        bohrmaschineManager = BohrmaschineManager.getInstance();
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public BohrMaschineFabrik getInstance(){
        return bohrMaschineFabrikSingleton;
    }

    @Override
    public void create(String[] attributes) {
        ref = new Referenz(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[2]));
        bohrmaschineManager.add(new Bohrmaschine(Integer.parseInt(attributes[0]), attributes[1]));
    }

    @Override
    public void resolveReference() {
        if(lagerplatzManager.get(ref.getLagerPlatz()).getZugehörigesElement() != null){
            lagerplatzManager.get(ref.getLagerPlatz()).setZugehörigesElement(bohrmaschineManager.get(ref.getRefObject()));
            bohrmaschineManager.get(ref.getRefObject()).setLagerplatz(lagerplatzManager.get(ref.getLagerPlatz()));
        }else{
            System.out.println("Lagerplatz nicht verfügbar");
        }

    }
}
