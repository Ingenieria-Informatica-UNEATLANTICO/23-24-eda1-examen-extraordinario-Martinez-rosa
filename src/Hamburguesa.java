package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private Pan panSuperior;
    private Pan panInferior;
    private Carne carne;
    private List<Extra> extras;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne) {
        this.panSuperior = panSuperior;
        this.panInferior = panInferior;
        this.carne = carne;
        this.extras = new ArrayList<>();
    }

    public void agregarExtra(Extra extra) {
        extras.add(extra);
    }

    public void eliminarExtra(Extra extra) {
        extras.remove(extra);
    }

    public void mostrar() {
        panSuperior.mostrar();
        carne.mostrar();
        for (Extra extra : extras) {
            extra.mostrar();
        }
        panInferior.mostrar();
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder(panSuperior.describir() + ", " + carne.describir());
        for (Extra extra : extras) {
            descripcion.append(", ").append(extra.describir());
        }
        descripcion.append("\n");
        return descripcion.toString();
    }
}
