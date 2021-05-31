package application.manager;


import domain.model.Reinigungsmittel;

import java.util.HashMap;

public class ReinigungsmittelManager implements Manager<Reinigungsmittel>{
    static private HashMap<Integer, Reinigungsmittel> reinigungsmittelHM = new HashMap<>();
    static private ReinigungsmittelManager reinigungsmittelManagerSingleton = new ReinigungsmittelManager();

    private ReinigungsmittelManager(){
        super();
    }
    public  static ReinigungsmittelManager getInstance(){
        return reinigungsmittelManagerSingleton;
    }
    public Reinigungsmittel get(int id) {
        return reinigungsmittelHM.get(id);
    }
    public void add(Reinigungsmittel reinigungsmittel){
        reinigungsmittelHM.put(reinigungsmittel.getId(), reinigungsmittel);
    }
    public void remove(int id){
        reinigungsmittelHM.remove(id);
    }
    public void update(Reinigungsmittel reinigungsmittel){
        reinigungsmittelHM.put(reinigungsmittel.getId(), reinigungsmittel);
    }
    @Override
    public HashMap<Integer, Reinigungsmittel> getAll() {
        return reinigungsmittelHM;
    }
}
