
package model;


public class Persona {
    
     /** Nombre de la persona. Es privado para protegerlo (encapsulamiento). */
    private String nombre;

    /** Rut (identificador) de la persona. También es privado. */
    private String rut;

    /**
     * Constructor vacío (sin parámetros).
     *
     * Crea una persona "en blanco", sin nombre ni rut. Es útil cuando se
     * quiere crear el objeto primero y asignarle los datos después usando los
     * métodos {@code set...}.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros.
     *
     * Crea una persona ya con su nombre y su rut asignados. La palabra clave
     * this sirve para diferenciar el atributo de la clase
     * this.nombre del parámetro que llega al método nombre.
     *
     * @param nombre nombre de la persona
     * @param rut    rut o identificador de la persona
     */
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * Un getter es un método que sirve para leer el valor de un
     * atributo privado desde fuera de la clase.
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la persona.
     *
     * Un setter es un método que sirve para modificar el valor de
     * un atributo privado desde fuera de la clase.
     *
     * @param nombre el nuevo nombre que se le quiere asignar a la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el rut de la persona.
     *
     * @return el rut de la persona
     */
    public String getRut() {
        return rut;
    }

    /**
     * Cambia el rut de la persona.
     *
     * @param rut el nuevo rut que se le quiere asignar a la persona
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Devuelve un texto con los datos básicos de la persona (nombre y rut).
     *
     * Este método será sobrescrito (con @Override) por las
     * clases hijas para añadir su propia información.
     * 
     * @return una cadena de texto con el nombre y el rut, cada uno en una línea
     */
    public String mostrarResumen() {
        return "Nombre: " + nombre + "\n"
                + "Rut: " + rut + "\n";
    }
}

    
