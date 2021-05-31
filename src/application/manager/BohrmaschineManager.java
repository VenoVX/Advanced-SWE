package application.manager;

import domain.model.Bohrmaschine;

import java.util.HashMap;

public class BohrmaschineManager implements Manager<Bohrmaschine> {
    static private HashMap<Integer, Bohrmaschine> bohrmaschineHM = new HashMap<>();
    static private BohrmaschineManager bohrmaschineManagerSingleton = new BohrmaschineManager();
    private BohrmaschineManager(){
        super();
    }
    public  static BohrmaschineManager getInstance(){
        return bohrmaschineManagerSingleton;
    }



    public Bohrmaschine get(int id) {
        return bohrmaschineHM.get(id);
    }
    public void add(Bohrmaschine bohrmaschine){
        bohrmaschineHM.put(bohrmaschine.getId(), bohrmaschine);
    }
    public void remove(int id){
        bohrmaschineHM.remove(id);
    }
    public void update(Bohrmaschine bohrmaschine){
        bohrmaschineHM.put(bohrmaschine.getId(), bohrmaschine);
    }
    @Override
    public HashMap<Integer, Bohrmaschine> getAll() {
        return bohrmaschineHM;
    }
}
