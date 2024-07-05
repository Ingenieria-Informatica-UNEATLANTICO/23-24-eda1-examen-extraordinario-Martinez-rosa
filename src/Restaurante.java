package src;

class Restaurante {

    private void atender() {
        Cocinero bobEsponja = new Cocinero();
        Camarero calamardo = new Camarero();
        
        bobEsponja.prepararHamburguesa();
        calamardo.recibir(bobEsponja.entregar());

        calamardo.servir();

        
        bobEsponja.prepararHamburguesa();
        Hamburguesa hamburguesa = bobEsponja.entregar();

        
        hamburguesa.moverIngrediente("Tomate", "Hamburguesa Básica");

        
        hamburguesa.quitarIngrediente("Queso");

    
        System.out.println("\nDespués de modificar la hamburguesa:");
        hamburguesa.imprimirIngredientes();
    }

    public static void main(String[] args) {
        Restaurante crustaceoCrujiente = new Restaurante();
        crustaceoCrujiente.atender();
    }
}
