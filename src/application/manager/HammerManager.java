package application.manager;

import domain.model.Hammer;

import java.util.HashMap;

public class HammerManager implements Manager<Hammer>{
    static private HashMap<Integer, Hammer> hammerHM = new HashMap<>();
    static private HammerManager hammerManagerSingleton = new HammerManager();
    private HammerManager(){
        super();
    }
    public  static HammerManager getInstance(){
        return hammerManagerSingleton;
    }

    public Hammer get(int id) {
        return hammerHM.get(id);
    }
    public void add(Hammer hammer){
        hammerHM.put(hammer.getId(), hammer);
    }
    public void remove(int id){
        hammerHM.remove(id);
    }
    public void update(Hammer hammer){
        hammerHM.put(hammer.getId(), hammer);
    }
    @Override
    public HashMap<Integer, Hammer> getAll() {
        return hammerHM;
    }
}
