package application.manager;

import domain.model.Mutter;

import java.util.HashMap;

public class MutterManager implements Manager<Mutter>{
    static private HashMap<Integer, Mutter> mutterHM = new HashMap<>();
    static private MutterManager mutterManagerSingleton = new MutterManager();

    private MutterManager(){
        super();
    }
    public  static MutterManager getInstance(){
        return mutterManagerSingleton;
    }
    public Mutter get(int id) {
        return mutterHM.get(id);
    }
    public void add(Mutter mutter){
        mutterHM.put(mutter.getId(), mutter);
    }
    public void remove(int id){
        mutterHM.remove(id);
    }
    public void update(Mutter mutter){
        mutterHM.put(mutter.getId(), mutter);
    }
    @Override
    public HashMap<Integer, Mutter> getAll() {
        return mutterHM;
    }
}
