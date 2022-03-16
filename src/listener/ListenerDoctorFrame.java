package listener;

import gui.InternalFrameDoctor;
import gui.InternalFrameHospital;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * * Creacion de escuchador del frame doctor, encargado de generar intereactividad
 * sobre el frame Doctor
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class ListenerDoctorFrame implements ActionListener {
    
    //declaracion de objetos
    private InternalFrameDoctor internalFrameDoctor;

    /**
     *Creacion de constructor de la clase
     * 
     * @param internalFrameDoctor Objeto que hace referencia a la clase Doctor
     * para darle funcionamiento a los botones
     * 
     **/
    public ListenerDoctorFrame(InternalFrameDoctor internalFrameDoctor) {
        this.internalFrameDoctor = internalFrameDoctor;
    }

    /**
     * clase abstracta enecargada de recibir las acciones de los botones
     * 
     * @param e variable que contiene los eventos de accion sobre los elementos
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();

        if (fuente == internalFrameDoctor.getBtnEspecialidad()) {
            //implementacion de clase para generar una lista de elementos seleccionables
            String[] options = {" Oftalmólogo ",
                " Neurólogo ", 
                " Dermatólogo ", 
                " Traumatólogo ",
                " Urólogo ",
                " Cardiólogo ",
                " General ",
                " Ginecólogo "};
            String n = (String) JOptionPane.showInputDialog(null, " Especialidad ",
                    "Seleccione la opcion ", JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            System.out.println(n);
        }
        return;
    }

}
