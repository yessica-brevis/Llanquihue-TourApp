
package data;

import java.util.ArrayList;
import java.util.List;
import model.Registrable;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Persona;
import model.Vehiculo;


/**
 * Gestiona (guarda y muestra) todos los usuarios de Llanquihue Tour.
 *
 * Esta clase usa una lista de Persona para almacenar los
 * usuarios. Como todos los tipos de usuario Guía Turístico, Colaborador Externo
 * heredan de Persona, podemos guardarlos todos juntos en
 * la misma lista de Persona. Esto es polimorfismo: tratamos objetos
 * de distintas clases hijas como si fueran del tipo padre.
 */
public class GestorEntidades {
 /** Lista donde se guardan todos los usuarios registrados. */
    private List<Registrable> listaEntidades;

    /**
     * Constructor.
     *
     * Crea la lista vacía con new ArrayList<>(). Un ArrayList
     * es una lista que puede crecer automáticamente a medida que se le agregan
     * elementos.
     */
    public GestorEntidades() {
        listaEntidades = new ArrayList<>();
    }

    /**
     * Agrega un usuario a la lista.
     *
     * El parámetro es de tipo Persona, por lo que acepta cualquier
     * objeto que herede de ella (un Guía Turistico o un colaboradot Externo).
     *
     * @param entidad el usuario que se quiere agregar a la lista
     */
    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }

    /**
     * Construye un texto con el resumen de todos los usuarios registrados.
     *
     * Recorre la lista con un bucle for-each. Para cada usuario usa el
     * operador instanceof, que sirve para preguntar de qué clase es
     * realmente un objeto. Según el tipo detectado, agrega una etiqueta y llama a
     * mostrarDatosBasicos(), que gracias al polimorfismo muestra los datos
     * propios de cada tipo de usuario.
     *
     * @return un texto con los datos de todos los usuarios, o un mensaje indicando
     *         que no hay usuarios si la lista está vacía
     */
    public String obtenerResumenEntidades() {

        if (listaEntidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        String resumen = "";

        for (Registrable entidad : listaEntidades) {
           

            if (entidad instanceof GuiaTuristico) {

                GuiaTuristico guiaTuristico = (GuiaTuristico) entidad;

                resumen += "Tipo detectado con instanceof: Este es un Guia Turistico.\n";
                resumen += guiaTuristico.mostrarResumen();

            } else if (entidad instanceof ColaboradorExterno) {

                ColaboradorExterno colaboradorExterno = (ColaboradorExterno) entidad;

                resumen += "Tipo detectado con instanceof: Este es un Colaborador Externo.\n";
                resumen += colaboradorExterno.mostrarResumen();
                
           

                        }
                        
            resumen += "-----------------------------\n";
        }

        return resumen;
    }

    
    }

   


