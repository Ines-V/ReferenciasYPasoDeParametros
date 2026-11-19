public class Caja{
    //Las variables.
    private String contenido;

    //
    public Caja(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //toString() para que la clase TestReferencia imprima los resultados.
    @Override
    public String toString() {
        return "Caja{" +
                "contenido='" + contenido + '\'' +
                '}';
    }
}