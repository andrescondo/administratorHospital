package listener;

import gui.InternalFrameConsulta;
import gui.InternalFrameDoctor;
import gui.InternalFrameHospital;
import gui.InternalFramePaciente;
import gui.InternalFrameTabla;
import gui.InternalFrameTablaDoctor;
import gui.InternalFrameTablaPaciente;
import gui.MiFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creacion de escuchador del frame principal, encargado de generar intereactividad
 * sobre el frame principal, ademas de implementacion de clase ActionListener
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since 09-03-2022, 16:45 horas
 */
public class ListenerMiFrame implements ActionListener {
    private MiFrame miFrame;
    private InternalFrameHospital internalFrameHospital;
    private InternalFrameTabla internalFrameTabla;
    private InternalFrameDoctor internalFrameDoctor;
    private InternalFrameTablaDoctor internalFrameTablaDoctor;
    private InternalFramePaciente internalFramePaciente;
    private InternalFrameTablaPaciente internalFrameTablaPaciente;
    private InternalFrameConsulta internalFrameConsulta;

    
    /**
     *Creacion de constructor de la clase
     * 
     * @param miFrame Objeto que hace referencia a la clase principal
     * para darle funcionamiento a los botones
     * 
     **/
    public ListenerMiFrame(MiFrame miFrame) {
        this.miFrame = miFrame;
    }

    
    /**
     * clase abstracta enecargada de recibir las acciones de los botones
     * 
     * @param e variable que contiene los eventos de accion sobre los elementos
     * */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();
        //validacion de boton presionado
        //Funcion de botones para HOSPITAL=====================
        if (fuente == miFrame.getCrearHospital()) {
            //extendido en una clase separada la nueva ventana
            internalFrameHospital = new InternalFrameHospital();

            miFrame.getDesktopPane().add(internalFrameHospital);
            internalFrameHospital.setVisible(true);
            return;
        }
        
        if (fuente == miFrame.getVerHospital()) {
            //extendido en una clase separada la nueva ventana
            internalFrameTabla = new InternalFrameTabla();

            miFrame.getDesktopPane().add(internalFrameTabla);
            internalFrameTabla.setVisible(true);
            return;
        }
        
        //Funcion de botones para DOCTOR=========================
        if (fuente == miFrame.getCrearDoctor()) {
            //extendido en una clase separada la nueva ventana
            internalFrameDoctor = new InternalFrameDoctor();

            miFrame.getDesktopPane().add(internalFrameDoctor);
            internalFrameDoctor.setVisible(true);
            return;
        }
        
        if (fuente == miFrame.getVerDoctor()) {
            //extendido en una clase separada la nueva ventana
            internalFrameTablaDoctor = new InternalFrameTablaDoctor();

            miFrame.getDesktopPane().add(internalFrameTablaDoctor);
            internalFrameTablaDoctor.setVisible(true);
            return;
        }
        
        
        //Funcion de botones para PACIENTES=====================
         if (fuente == miFrame.getCrearPaciente()) {
            //extendido en una clase separada la nueva ventana
            internalFramePaciente = new InternalFramePaciente();

            miFrame.getDesktopPane().add(internalFramePaciente);
            internalFramePaciente.setVisible(true);
            return;
        }
        
        if (fuente == miFrame.getVerPaciente()) {
            //extendido en una clase separada la nueva ventana
            internalFrameTablaPaciente = new InternalFrameTablaPaciente();

            miFrame.getDesktopPane().add(internalFrameTablaPaciente);
            internalFrameTablaPaciente.setVisible(true);
            return;
        }
        
        //creacion de consulta
        if (fuente == miFrame.getMenuConsulta()) {
            //extendido en una clase separada la nueva ventana
            internalFrameConsulta = new InternalFrameConsulta();

            miFrame.getDesktopPane().add(internalFrameConsulta);
            internalFrameConsulta.setVisible(true);
            return;
        }

        //validacion de boton presionado
        if (fuente == miFrame.getMenuSalir()) {
            System.exit(0);
        }

    }

}
