
# Solucion de Gestión de Ingredientes para Hamburguesas

## Descripción
Esta solucion adapta la clase `Hamburguesa` para manejar los ingredientes mediante una estructura de árbol. Esto facilita la organización y manipulación de ingredientes de una manera jerárquica y eficiente. Además, permite agregar, quitar y mover ingredientes dentro de la estructura de árbol.

## Clases Modificadas
- `Hamburguesa`: Maneja los ingredientes como nodos en un árbol, con métodos para agregar, quitar y mover ingredientes.
- `Ingrediente`: Simplificada para representar un nodo en el árbol de ingredientes.
- `Cocinero`: Prepara la hamburguesa usando la nueva estructura.
- `Camarero`: Recibe y sirve la hamburguesa mostrando sus ingredientes.
- `Restaurante`: Coordina las operaciones de cocinar y servir la hamburguesa.

## Métodos Principales en `Hamburguesa`
- `agregarIngrediente(String nombrePadre, String nombreIngrediente)`: Añade un ingrediente como hijo de otro ingrediente.
- `quitarIngrediente(String nombreIngrediente)`: Quita un ingrediente del árbol.
- `moverIngrediente(String nombreIngrediente, String nuevoPadre)`: Mueve un ingrediente a un nuevo padre en el árbol.
- `imprimirIngredientes()`: Imprime todos los ingredientes de la hamburguesa en estructura de árbol.


