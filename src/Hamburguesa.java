package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private List<Ingrediente> ingrediente;

    public Hamburguesa() {
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void eliminarIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

    public void mostrar() {
        for (Ingrediente ingrediente : ingredientes) {
            ingrediente.mostrar();
        }
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder();
        for (int i = 0; i < ingredientes.size(); i++) {
            descripcion.append(ingredientes.get(i).describir());
            if (i < ingredientes.size() - 1) {
                descripcion.append(", ");
            }
        }
        descripcion.append("\n");
        return descripcion.toString();
    }
}