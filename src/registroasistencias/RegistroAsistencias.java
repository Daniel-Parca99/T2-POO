/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroasistencias;

import Pantallas.JFrameRegistroAsistencia;

/**
 *
 * @author Daniel Paredes
 */
public class RegistroAsistencias {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrameRegistroAsistencia framePrincipal =new JFrameRegistroAsistencia();  //llamar la ventana princal
        framePrincipal.setLocationRelativeTo(null); //Para centrar en la ventana 
        framePrincipal.setVisible(true); //Hacer visible el formulario
        
    }
    
}
