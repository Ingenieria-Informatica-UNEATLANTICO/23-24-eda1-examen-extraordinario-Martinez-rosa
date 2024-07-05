package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private List<Ingrediente> ingrediente;

    public Hamburguesa() {
        this.ingredientes = new ArrayList<>();
    }

     public void agregarIngrediente(String nombrePadre, String nombreIngrediente) {
        Ingrediente padre = buscarIngrediente(nombrePadre, ingredientes);
        if (padre != null) {
            padre.agregarHijo(new Ingrediente(nombreIngrediente));
        }
    }

    public void quitarIngrediente(String nombreIngrediente) {
        quitarIngrediente(nombreIngrediente, ingredientes);

    }
      private void quitarIngrediente(String nombreIngrediente, Ingrediente ingrediente) {
        if (ingrediente != null) {
            ingrediente.quitarHijo(nombreIngrediente);
            quitarIngrediente(nombreIngrediente, ingrediente.getPrimerHijo());
            quitarIngrediente(nombreIngrediente, ingrediente.getSiguienteHermano());
        }
    }
     public void moverIngrediente(String nombreIngrediente, String nuevoPadre) {
        Ingrediente ingrediente = buscarIngrediente(nombreIngrediente, ingredientes);
        if (ingrediente != null) {
            quitarIngrediente(nombreIngrediente);
            agregarIngrediente(nuevoPadre, nombreIngrediente);
        }
    }
       private Ingrediente buscarIngrediente(String nombre, Ingrediente ingrediente) {
        if (ingrediente == null) {
            return null;
        }
        if (ingrediente.describir().equals(nombre)) {
            return ingrediente;
        }
        Ingrediente result = buscarIngrediente(nombre, ingrediente.getPrimerHijo());
        if (result == null) {
            result = buscarIngrediente(nombre, ingrediente.getSiguienteHermano());
        }
        return result;
    }

    public void mostrar() {
        for (Ingrediente ingrediente : ingredientes) {
            ingrediente.mostrar();
        }
    }
     private void imprimirIngredientes(Ingrediente ingrediente, String prefijo) {
        if (ingrediente != null) {
            System.out.println(prefijo + ingrediente.describir());
            imprimirIngredientes(ingrediente.getPrimerHijo(), prefijo + "--");
            imprimirIngredientes(ingrediente.getSiguienteHermano(), prefijo);
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