/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author damian
 */
public class AbstractFactory {

    /**
     * Realiza dos dialogos diferentes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialogo miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("Hola desde una consola");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("Hola desde una ventana");
    }
    
}
