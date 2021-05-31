package application.fabrik;

import domain.model.Lagerplatz;

public interface Fabrik {
    void create(String[] attributes);
    void resolveReference();
}
