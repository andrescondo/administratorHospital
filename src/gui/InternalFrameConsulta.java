
package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * * Creacion de internalFrame del frame de consulta, encargado de generar 
 * un frama de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class InternalFrameConsulta extends JInternalFrame{
    
    //declaracion de elementos
    private JPanel panelPrincipal;
    private JLabel labelFechaCreacion;
    private JLabel labelConsultorio;
    private JLabel labelDiagnostico;
    private JLabel labelReceta;
    private JLabel labelDireccion;
    private JPanel labelDireccionBox;
    private JPanel labelFormularioBoton;

    private JLabel labelDireccionBoxCiudad;
    private JLabel labelDireccionBoxCalle;
    private JLabel labelDireccionBoxNumero;

    private JTextField textFechaCreacion;
    private JTextField textConsultorio;
    private JTextField textDiagnostico;
    private JTextField textReceta;
    private JTextField textCiudad;
    private JTextField textCalle;
    private JTextField textNumero;
    
     private JButton btnSave;
    
    //creacion de constructor
    public InternalFrameConsulta(){
        initComponents();
    }
    
    //creacion de caracteristicas de la ventana
     private void initComponents() {
        setSize(600, 200);
        setTitle("Crear Consulta ::: Kevin Andres Condo Chaguay");
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);

        //creacion de diseño en grid para elementos
        GridLayout miGridLayout = new GridLayout(6, 2);
        GridLayout direccionGridLayout = new GridLayout(1, 6);

        //creacion y asignacion de panelPrincipal
        panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(miGridLayout);

        labelFechaCreacion = new JLabel("Fecha creacion");
        textFechaCreacion = new JTextField();
        labelConsultorio = new JLabel("Consultorio");
        textConsultorio = new JTextField();
        labelDiagnostico = new JLabel("Diagnostico");
        textDiagnostico = new JTextField();
        labelReceta = new JLabel("Receta");
        textReceta = new JTextField();
        labelDireccion = new JLabel("Direccion");
        labelDireccionBox = new JPanel();
        labelFormularioBoton = new JPanel();

        labelDireccionBox.setLayout(direccionGridLayout);
        labelDireccionBoxCiudad = new JLabel("Ciudad");
        textCiudad = new JTextField();
        labelDireccionBoxCalle = new JLabel("Calle");
        textCalle = new JTextField();
        labelDireccionBoxNumero = new JLabel("Numero");
        textNumero = new JTextField();
        btnSave = new JButton("Guardar");

        panelPrincipal.add(labelFechaCreacion);
        panelPrincipal.add(textFechaCreacion);
        panelPrincipal.add(labelConsultorio);
        panelPrincipal.add(textConsultorio);
        panelPrincipal.add(labelDiagnostico);
        panelPrincipal.add(textDiagnostico);
        panelPrincipal.add(labelReceta);
        panelPrincipal.add(textReceta);
        panelPrincipal.add(labelDireccion);
        panelPrincipal.add(labelDireccionBox);
        panelPrincipal.add(labelFormularioBoton);
        labelFormularioBoton.add(btnSave);

        labelDireccionBox.add(labelDireccionBoxCiudad);
        labelDireccionBox.add(textCiudad);
        labelDireccionBox.add(labelDireccionBoxCalle);
        labelDireccionBox.add(textCalle);
        labelDireccionBox.add(labelDireccionBoxNumero);
        labelDireccionBox.add(textNumero);
    }


    
}
