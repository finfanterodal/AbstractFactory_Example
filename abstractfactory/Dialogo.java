/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 * Clase principal que sirve para aunar los metodos
 * @author damian
 */
abstract class Dialogo implements MetodosComunes{
    /**
     * Las subclases sobrescriben este método ya. Por eso lo dejamos vacio.
     * @param msg mensaje a mostrar
     */
    @Override
    public void mostrar(String msg) {
    }
    /**
     * Selecciona el tipo de dialogo a crear
     */
    enum Tipo {
        CONSOLA,
        VENTANA
    }
    /**
     * Crea un objeto Dialogo segun el tipo
     * @param tipo CONSOLA, crea objeto ConsDialogo. VENTANA, crea objeto WinDialogo
     * @return objeto Dialog 
     */
    static public Dialogo crearDialogo(Tipo tipo) {
        Dialogo dialogoCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                dialogoCreado = new ConsDialogo();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                dialogoCreado = new WinDialogo();
                break;
            default:
                dialogoCreado = null;
        }
        
        return dialogoCreado;

    }

}
