
package model;

/**
 * Representa un vehículo utilizado por la agencia Llanquihue Tour.
 *
 * Implementa la interfaz Registrable para que pueda almacenarse junto a otras
 * entidades del sistema y mostrar un resumen de su información.
 */
public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;
    private int capacidadPasajeros;

    /**
     * Constructor vacío.
     */
    public Vehiculo() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param patente Patente del vehículo.
     * @param tipo Tipo de vehículo (Van, Minibús, Bus, etc.).
     * @param capacidadPasajeros Cantidad de pasajeros que puede transportar.
     */
    public Vehiculo(String patente, String tipo, int capacidadPasajeros) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String mostrarResumen() {

        return "Vehículo\n"
                + "Patente: " + patente + "\n"
                + "Tipo: " + tipo + "\n"
                + "Capacidad de pasajeros: " + capacidadPasajeros + "\n";

    }

}