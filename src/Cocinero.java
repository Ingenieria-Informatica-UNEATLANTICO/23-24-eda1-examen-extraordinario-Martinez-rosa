package src;

public class Cocinero {

    private Hamburguesa hamburguesa;

    public void prepararHamburguesa() {
        hamburguesa = new Hamburguesa("Hamburguesa Básica");
        hamburguesa.agregarIngrediente("Hamburguesa Básica", "Carne");
        hamburguesa.agregarIngrediente("Carne", "Queso");
        hamburguesa.agregarIngrediente("Carne", "Tomate");
    }

    public Hamburguesa entregar() {
        return hamburguesa;
    }
}
