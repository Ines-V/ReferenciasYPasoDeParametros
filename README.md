6. REFERENCIAS Y PASO DE PARÁMETROS.

Crea la clase Caja con un atributo privado contenido (String), constructor, getter y setter. En la clase de prueba escribe estos métodos estáticos: 

• modificar(Caja c): cambia el contenido de la caja que recibe. 

• reasignar(Caja c): asigna a c una caja nueva (c = new Caja("nueva")). 

• incrementar(int n): suma 10 a n. 

Clase de prueba: TestReferencias. 

• Antes de ejecutar, escribe en un comentario qué crees que se mostrará en cada caso. 

• Llama a los tres métodos con una caja y un entero, y muestra el valor de la caja y del entero después de cada llamada. 

• Crea Caja a = new Caja("libros"); Caja b = a;, cambia el contenido a través de b y muestra a. Explica en un comentario qué ha pasado. 

• Declara Caja c = null;, llama a c.getContenido() y captura la excepción que se produce. 

• Añade un comentario que explique por qué reasignar no afecta a la variable original aunque modificar sí.
