package application.manager;

import domain.model.Holzschraube;

import java.util.HashMap;

public class HolzschraubeManager implements Manager<Holzschraube> {
    static private HashMap<Integer, Holzschraube> holzschraubenHM = new HashMap<>();
    static private HolzschraubeManager HolzschraubeManagerSingleton = new HolzschraubeManager();
    private HolzschraubeManager(){
        super();
    }
    public  static HolzschraubeManager getInstance(){
        return HolzschraubeManagerSingleton;
    }



    public Holzschraube get(int id) {
        return holzschraubenHM.get(id);
    }
    public void add(Holzschraube holzschraube){
        holzschraubenHM.put(holzschraube.getId(), holzschraube);
    }
    public void remove(int id){
        holzschraubenHM.remove(id);
    }
    public void update(Holzschraube holzschraube){
        holzschraubenHM.put(holzschraube.getId(), holzschraube);
    }


    @Override
    public HashMap<Integer, Holzschraube> getAll() {
        return holzschraubenHM;
    }
}
