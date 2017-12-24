/**
 * Resuelve la Guía 1.5 del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-21 (yyyy-mm-dd)
 */
package modelo;

/**
 * Corresponde a la clase desde la cual se instancian objetos indicador que
 * contienen como atributos los datos del indicador
 *
 * @author Daniel Zúñiga Correa, 2017-12-21 (yyyy-mm-dd)
 */
public class Indicador {

    private String codigo;
    private String nombre;
    private String unidadMedida;
    private String[] fecha;
    private String[] valor;

//    Constructor sin parámetros
    public Indicador() {
    }

//    Mutadores y Accesadores
    public String[] getValor() {
        return valor;
    }

    public void setValor(String[] valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }
}
