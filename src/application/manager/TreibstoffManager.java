package application.manager;

import domain.model.Schraubendreher;
import domain.model.Treibstoff;

import java.util.HashMap;

public class TreibstoffManager implements Manager<Treibstoff> {
    static private HashMap<Integer, Treibstoff> treibstoffHM = new HashMap<>();
    static private TreibstoffManager treibstoffManagerSingleton = new TreibstoffManager();

    private TreibstoffManager(){
        super();
    }
    public  static TreibstoffManager getInstance(){
        return treibstoffManagerSingleton;
    }
    public Treibstoff get(int id) {
        return treibstoffHM.get(id);
    }
    public void add(Treibstoff schraubendreher){
        treibstoffHM.put(schraubendreher.getId(), schraubendreher);
    }
    public void remove(int id){
        treibstoffHM.remove(id);
    }
    public void update(Treibstoff schraubendreher){
        treibstoffHM.put(schraubendreher.getId(), schraubendreher);
    }
    @Override
    public HashMap<Integer, Treibstoff> getAll() {
        return treibstoffHM;
    }
}
