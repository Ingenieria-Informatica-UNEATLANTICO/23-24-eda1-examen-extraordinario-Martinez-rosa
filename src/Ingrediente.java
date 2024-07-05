package src;

public class Ingrediente {
    protected String nombre;
    private Ingrediente primerHijo;
    private Ingrediente siguienteHermano;

    public Ingrediente(String nombre) {
        this.nombre = nombre;
        this.primerHijo = null;
        this.siguienteHermano = null;
    }

    public String describir() {
        return nombre;
    }

    public void mostrar() {
        System.out.println(nombre);
    }

    public void agregarHijo(Ingrediente hijo) {
        if (this.primerHijo == null) {
            this.primerHijo = hijo;
        } else {
            Ingrediente temp = this.primerHijo;
            while (temp.siguienteHermano != null) {
                temp = temp.siguienteHermano;
            }
            temp.siguienteHermano = hijo;
        }
    }

    public Ingrediente getPrimerHijo() {
        return primerHijo;
    }

    public Ingrediente getSiguienteHermano() {
        return siguienteHermano;
    }

    public void setSiguienteHermano(Ingrediente siguienteHermano) {
        this.siguienteHermano = siguienteHermano;
    }

    public void quitarHijo(String nombreHijo) {
        if (primerHijo != null) {
            if (primerHijo.describir().equals(nombreHijo)) {
                primerHijo = primerHijo.getSiguienteHermano();
            } else {
                Ingrediente temp = primerHijo;
                while (temp.getSiguienteHermano() != null) {
                    if (temp.getSiguienteHermano().describir().equals(nombreHijo)) {
                        temp.setSiguienteHermano(temp.getSiguienteHermano().getSiguienteHermano());
                        break;
                    }
                    temp = temp.getSiguienteHermano();
                }
            }
        }
    }
}
