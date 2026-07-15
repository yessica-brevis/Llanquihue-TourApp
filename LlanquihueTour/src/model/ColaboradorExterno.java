
package model;
/**
 * Representa a un colaborador externo de la Agencia de Turismo Llanquihue Tour.
 *
 * Al igual que  Guía Turístico}, esta clase hereda
 * de  Persona extends Persona e implementa la interfaz
 *  Registrable} implements Registrable}).
 *
 * Lo único propio de un Colaborador Externo es su {@code empresaAsociada}.
 */
public class ColaboradorExterno extends Persona implements Registrable {

    /** Empresa Asociada (dato propio de esta clase). */
    private String empresaAsociada;

    /**
     * Constructor vacío (sin parámetros).
     *
     * Crea un Colaborador Externo sin datos. Se pueden asignar después con los métodos
     * {@code set...}.
     */
    public ColaboradorExterno() {
    }

    /**
     * Constructor con parámetros.
     *
     * Con {@code super(nombre, rut)} se llama al constructor de  Persona}
     * para guardar el nombre y el rut; después se guarda el dato propio: la empresa Asociada.
     *
     * @param nombre nombre del jugador
     * @param rut    rut o identificador del jugador
     * @param empresaAsociada  empresa Asociada del Colaborador Externo
     */
    
    public ColaboradorExterno(String nombre, String rut, String empresaAsociada) {
        super(nombre, rut);
        this.empresaAsociada = empresaAsociada;
    }

    /**
     * Devuelve la empresa Asociada del Colaborador Externo
     *
     * @return la emrpesa asociada del Colaborador Externo
     */
    public String getEmpresaAsociada() {
        return empresaAsociada;
    }

    /**
     * Cambia la empresa Asociada al Colaborador Externo
     *
     * @param empresaAsociada la nueva empresa Asociada que se le quiere asignar
     */
    public void setEmpresaAsociada(String empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    /**
     * Devuelve los datos básicos del Colaborador Externo, incluyendo su empresa Asociada.
     *
     * @Override indica que este método sobrescribe al de la
     * clase padre. Con super.mostrarDatosBasicos() se reutiliza el texto
     * del padre (nombre y rut) y se le agrega la empresa Asociada.
     *
     * @return el nombre, el rut y la emrpesa Asociada del Colaborador Externo
     */
    
    @Override
    public String mostrarResumen(){
        return super.mostrarResumen() +  "Empresa Asociada: " + empresaAsociada + "\n";
    }

  
}
