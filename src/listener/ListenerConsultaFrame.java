package listener;

import gui.InternalFrameConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * * Creacion de escuchador del frame consultorio, encargado de generar intereactividad
 * sobre el frame consultorio, implementa el ActionListener para poder escuchar
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class ListenerConsultaFrame implements ActionListener {

    private InternalFrameConsulta internalFrameConsulta;
    
    public ListenerConsultaFrame() {

    }

    /**
     * clase abstracta enecargada de recibir las acciones de los botones
     * 
     * @param e variable que contiene los eventos de accion sobre los elementos
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();

//        if (fuente == internalFrameConsulta.getBtnEspecialidad()) {
//            //extendido en una clase separada la nueva ventana
//            
//            return;
//        }
       
    }

}
