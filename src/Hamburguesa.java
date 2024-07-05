package src;

public class Hamburguesa {
    private Ingrediente raiz;

    public Hamburguesa(String ingredientePrincipal) {
        this.raiz = new Ingrediente(ingredientePrincipal);
    }

    public void agregarIngrediente(String nombrePadre, String nombreIngrediente) {
        Ingrediente padre = buscarIngrediente(nombrePadre, raiz);
        if (padre != null) {
            padre.agregarHijo(new Ingrediente(nombreIngrediente));
        }
    }

    public void quitarIngrediente(String nombreIngrediente) {
        quitarIngrediente(nombreIngrediente, raiz);
    }

    private void quitarIngrediente(String nombreIngrediente, Ingrediente ingrediente) {
        if (ingrediente != null) {
            ingrediente.quitarHijo(nombreIngrediente);
            quitarIngrediente(nombreIngrediente, ingrediente.getPrimerHijo());
            quitarIngrediente(nombreIngrediente, ingrediente.getSiguienteHermano());
        }
    }

    public void moverIngrediente(String nombreIngrediente, String nuevoPadre) {
        Ingrediente ingrediente = buscarIngrediente(nombreIngrediente, raiz);
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

    public void imprimirIngredientes() {
        imprimirIngredientes(raiz, "");
    }

    private void imprimirIngredientes(Ingrediente ingrediente, String prefijo) {
        if (ingrediente != null) {
            System.out.println(prefijo + ingrediente.describir());
            imprimirIngredientes(ingrediente.getPrimerHijo(), prefijo + "--");
            imprimirIngredientes(ingrediente.getSiguienteHermano(), prefijo);
        }
    }
}
