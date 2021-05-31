package application.manager;

import domain.model.Schraubendreher;

import java.util.HashMap;

public class SchraubendreherManager implements Manager<Schraubendreher> {
    static private HashMap<Integer, Schraubendreher> schraubendreherHM = new HashMap<>();
    static private SchraubendreherManager schraubendreherManagerSingleton = new SchraubendreherManager();

    private SchraubendreherManager(){
        super();
    }
    public  static SchraubendreherManager getInstance(){
        return schraubendreherManagerSingleton;
    }
    public Schraubendreher get(int id) {
        return schraubendreherHM.get(id);
    }
    public void add(Schraubendreher schraubendreher){
        schraubendreherHM.put(schraubendreher.getId(), schraubendreher);
    }
    public void remove(int id){
        schraubendreherHM.remove(id);
    }
    public void update(Schraubendreher schraubendreher){
        schraubendreherHM.put(schraubendreher.getId(), schraubendreher);
    }
    @Override
    public HashMap<Integer, Schraubendreher> getAll() {
        return schraubendreherHM;
    }
}
