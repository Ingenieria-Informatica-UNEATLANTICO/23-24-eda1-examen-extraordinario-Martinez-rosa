package src;

class Cocinero extends Empleado {
    public void prepararHamburguesa() {
        hamburguesa = new Hamburguesa();


        hamburguesa.agregarIngrediente(new Pan("Pan superior"));
        hamburguesa.agregarIngrediente(new Lechuga());
        hamburguesa.agregarIngrediente(new Tomate());
        hamburguesa.agregarIngrediente(new Carne("Res", "al punto"));
        hamburguesa.agregarIngrediente(new Queso("Cheddar"));
        hamburguesa.agregarIngrediente(new Pan("Pan inferior"));

        System.out.println("Hamburguesa original:");
        hamburguesa.mostrar();

       
        hamburguesa.eliminarIngrediente("Lechuga");
        hamburguesa.agregarIngredienteEnPosicion(new Lechuga(), 4); // Ponemos la lechuga justo antes del pan inferior

       
        hamburguesa.eliminarIngrediente("Tomate");

       
        int posicionQueso = 3; 
        hamburguesa.agregarIngredienteEnPosicion(new Salsa("BBQ"), posicionQueso);

        System.out.println("\nHamburguesa modificada:");
        hamburguesa.mostrar();
    }
}