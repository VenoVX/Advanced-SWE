package application.fabrik;
import application.manager.LagerplatzManager;
import domain.model.Lagerplatz;
public class LagerplatzFabrik {
    private LagerplatzManager lagerplatzManager;
    private LagerplatzFabrik lagerplatzFabrikSingleton = new LagerplatzFabrik();
    private LagerplatzFabrik(){
        lagerplatzManager = LagerplatzManager.getInstance();
    }
    public LagerplatzFabrik getInstance(){
        return lagerplatzFabrikSingleton;
    }
    public void createAll(){
        for(int i = 0; i<=100; i++){
            lagerplatzManager.add(new Lagerplatz(i));
        }
    }
}
