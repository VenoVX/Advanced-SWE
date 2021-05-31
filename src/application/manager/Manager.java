package application.manager;

import java.util.HashMap;

public interface Manager<V> {
    HashMap<Integer, V> getAll();
}
