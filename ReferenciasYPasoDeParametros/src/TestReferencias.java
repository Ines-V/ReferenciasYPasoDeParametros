public class TestReferencias {

    public static void modificar(Caja c) { // Cambiar contenido por otro.
        c.setContenido("Cambiar contenido.");
    }

    public static void reasignar(Caja c) { // Cambiar el valor antiguo por uno nuevo.
        c = new Caja("Nueva caja.");
    }

    public static void incrementar(int n) { // Aumenta 10 el numero.
        n = n + 10;
    }

    public static void main(String[] args) {
        Caja cajaUno = new Caja("Contenido: ");
        int num = 18;

        modificar(cajaUno);
        System.out.println("Después de modificar: " + cajaUno.getContenido());

        reasignar(cajaUno);
        System.out.println("Después de reasignar: " + cajaUno.getContenido());

        incrementar(num);
        System.out.println("Después de incrementar: " + num);

        /*
        La Caja a tiene como contenido Libros.
        La Caja b tiene como contenido Enciclopedias.
        Igualar b y a. Para que el contenido de b pase a ser el contenido de a.
         */
        Caja a = new Caja("Libros");
        Caja b = a;
        b.setContenido("Enciclopedias");
        System.out.println("Contenido de a: " + a.getContenido());

        //La caja c no tiene contenido (null).
        Caja c = null;
        try {
            System.out.println(c.getContenido());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
