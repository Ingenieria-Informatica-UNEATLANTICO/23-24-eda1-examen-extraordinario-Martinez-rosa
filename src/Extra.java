package src;

class Extra extends Ingrediente {
    public Extra(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("- Extra: " + nombre);
    }
}