package application.manager;

import domain.model.Metallschraube;

import java.util.HashMap;

public class MetallschraubeManager implements Manager<Metallschraube>{
    static private HashMap<Integer, Metallschraube> metallschraubeHM = new HashMap<>();
    static private MetallschraubeManager metallschraubeManagerSingleton = new MetallschraubeManager();

    private MetallschraubeManager(){
        super();
    }
    public  static MetallschraubeManager getInstance(){
        return metallschraubeManagerSingleton;
    }



    public Metallschraube get(int id) {
        return metallschraubeHM.get(id);
    }
    public void add(Metallschraube metallschraube){
        metallschraubeHM.put(metallschraube.getId(), metallschraube);
    }
    public void remove(int id){
        metallschraubeHM.remove(id);
    }
    public void update(Metallschraube metallschraube){
        metallschraubeHM.put(metallschraube.getId(), metallschraube);
    }

    @Override
    public HashMap<Integer, Metallschraube> getAll() {
        return metallschraubeHM;
    }
}
