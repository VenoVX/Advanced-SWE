package application.manager;

import domain.model.Bohrmaschine;
import domain.model.Lagerplatz;

import java.util.HashMap;

public class LagerplatzManager implements Manager<Lagerplatz> {
    static private HashMap<Integer, Lagerplatz> lagerplatzHM = new HashMap<>();
    static private LagerplatzManager lagerplatzManagerSingleton = new LagerplatzManager();
    private LagerplatzManager(){
        super();
    }
    public  static LagerplatzManager getInstance(){
        return lagerplatzManagerSingleton;
    }
    public Lagerplatz get(int id) {
        return lagerplatzHM.get(id);
    }
    public void add(Lagerplatz lagerplatz){
        lagerplatzHM.put(lagerplatz.getId(), lagerplatz);
    }
    public void remove(int id){
        lagerplatzHM.remove(id);
    }
    public void update(Lagerplatz lagerplatz){
        lagerplatzHM.put(lagerplatz.getId(), lagerplatz);
    }

    @Override
    public HashMap<Integer, Lagerplatz> getAll() {
        return lagerplatzHM;
    }
}
