/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import javax.swing.JOptionPane;

/**
 *
 * @author damian
 */
class WinDialogo extends Dialogo {

    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);              
    }
    
}
