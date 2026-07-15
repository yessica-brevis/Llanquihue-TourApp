
package model;
/**
 * Contrato que indica que una clase "puede registrarse" en el sistema.
 *
 * Una interfaz es como un contrato o una lista de
 * obligaciones: no contiene código que haga cosas, solo dice qué métodos
 * debe tener obligatoriamente cualquier clase que la use.
 *
 * Cuando una clase escribe implements Registrable, se compromete a
 * escribir el cuerpo del método #registrar(). Si no lo hace, el programa
 * no compila. En este proyecto la implementan Jugador, Administrador,
 * Tester y también Automovil.
 */

public interface Registrable {
    
 /**
     * Registra el objeto y devuelve un mensaje de confirmación.
     *
     * Cada clase que implemente esta interfaz debe escribir su propia versión
     * de este método (esto es polimorfismo: el mismo nombre de método se
     * comporta distinto según la clase).
     *
     * @return un mensaje que confirma que el registro se realizó
     */
    
public String mostrarResumen();
    
}
