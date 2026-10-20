public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA REGISTRO DE SENSORES ===");
        
        sensor sensor = new sensor("Temperatura", "°C");
        sensor.mostrarInformacion();

        System.out.println("\nTotal de sensores: " + sensor.getCantidadSensores());
    }
}