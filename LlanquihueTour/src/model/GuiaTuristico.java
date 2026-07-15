
package model;
/**
 * Representa a un guía turístico de la Agencia de Turismo Llanquihue Tour.
 *
 * Esta clase hereda de Persona extends Persona, por lo
 * que ya tiene nombre y rut sin necesidad de declararlos otra vez. Además,
 * implementa la interfaz Registrable} implements Registrable,
 * lo que la obliga a escribir el método #registrar().
 *
 * <p>Lo único propio de un guía turístico es su {@code areaDeTrabajo}.
 */

public class GuiaTuristico extends Persona implements Registrable {
  
 /** Área de trabajo del guía turístico (dato propio de esta clase). */
    private String areaDeTrabajo;

    /**
     * Constructor vacío (sin parámetros).
     *
     * Crea un guia turítico sin datos. Se pueden asignar después con los
     * métodos {@code set...}.
     */
    public GuiaTuristico() {
    }

    /**
     * Constructor con parámetros.
     *
     * La instrucción super(nombre, rut) llama al constructor de la
     * clase padre Persona para que guarde el nombre y el rut. Luego esta
     * clase guarda su dato propio: el área de trabajo.
     *
     * @param nombre nombre del guía turístico
     * @param rut    rut o identificador del guía turístico
     * @param areaDeTrabajo  área de trabajo del guía turístico
     */
    public GuiaTuristico(String nombre, String rut, String areaDeTrabajo) {
        super(nombre, rut);
        this.areaDeTrabajo = areaDeTrabajo;
    }

    /**
     * Devuelve el área de trabajo del Guía Turístico
     *
     * @return el área del guía turístico
     */
    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    /**
     * Cambia el área de trabajo del guía turístico
     *
     * @param areaDeTrabajo la nueva área de trabajo que se le quiere asignar
     */
    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    /**
     * Devuelve los datos básicos del guía turístico, incluyendo su área de trabajo.
     *
     * @Override indica que este método sobrescribe (reemplaza)
     * al de la clase padre. Con super.mostrarDatosBasicos() reutilizamos
     * el texto del padre (nombre y rut) y le agregamos el área de trabajo.
     *
     * @return el nombre, el rut y el área del guía turístico
     */
    @Override
    public String mostrarResumen(){
        return super.mostrarResumen() +  "Area De Trabajo: " + areaDeTrabajo + "\n";
    }

 
    }


   

