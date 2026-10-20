public class sensor {
    private int id;
    private String tipo;
    private String unidad;
    private double lectura;
    private static int cantidadSensores = 0;

    public sensor(String tipo, String unidad) {
        cantidadSensores++;
        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        this.lectura = 0;
    }

    public static int getCantidadSensores() {
        return cantidadSensores;
    }

    public void mostrarInformacion() {
        System.out.println("Sensor ID: " + id + " | Tipo: " + tipo + " | Unidad: " + unidad + " | Lectura: " + lectura);
    }
}
