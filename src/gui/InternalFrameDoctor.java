
package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import listener.ListenerDoctorFrame;


/**
 * * Creacion de internalFrame del frame de consulta, encargado de generar 
 * un frame de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class InternalFrameDoctor extends JInternalFrame {
    
    //declaracion de elementos
    private JPanel panelPrincipal;
    private JLabel labelName;
    private JLabel labelCedula;
    private JLabel labelTelefono;
    private JLabel labelDireccion;
    private JPanel labelDireccionBox;
    private JPanel labelFormularioBoton;
    private JLabel labelCarnet;
    private JLabel labelEspecialidad;


    private JLabel labelDireccionBoxCiudad;
    private JLabel labelDireccionBoxCalle;
    private JLabel labelDireccionBoxNumero;

    private JTextField textName;
    private JTextField textCedula;
    private JTextField textTelefono;
    private JTextField textCiudad;
    private JTextField textCalle;
    private JTextField textNumero;
    private JTextField textCarnet;
    private JButton btnEspecialidad;

    private JButton btnSave;
    
    
    //declaracion de constructor
    public InternalFrameDoctor(){
        initComponents(); //adicion de caracteristicas basicas
        addListener();//creacion de clase escuchadora
    }

    public JLabel getLabelEspecialidad() {
        return labelEspecialidad;
    }

    public void setLabelEspecialidad(JLabel labelEspecialidad) {
        this.labelEspecialidad = labelEspecialidad;
    }

    public JLabel getLabelDireccionBoxNumero() {
        return labelDireccionBoxNumero;
    }

    public void setLabelDireccionBoxNumero(JLabel labelDireccionBoxNumero) {
        this.labelDireccionBoxNumero = labelDireccionBoxNumero;
    }

    public JButton getBtnEspecialidad() {
        return btnEspecialidad;
    }

    public void setBtnEspecialidad(JButton btnEspecialidad) {
        this.btnEspecialidad = btnEspecialidad;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }
    
    //declaracion de base de archivos
    private void initComponents() {
        setSize(600, 200);
        setTitle("Crear Medico ::: Kevin Andres Condo Chaguay");
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);

        GridLayout miGridLayout = new GridLayout(7, 2);
        GridLayout direccionGridLayout = new GridLayout(1, 6);

        //creacion y asignacion de panelPrincipal
        panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(miGridLayout);

        labelName = new JLabel("Nombre");
        textName = new JTextField();
        labelCedula = new JLabel("Numero de cedula");
        textCedula = new JTextField();
        labelTelefono = new JLabel("Telefono");
        textTelefono = new JTextField();
        labelCarnet = new JLabel("Carnet");
        textCarnet = new JTextField();
        labelEspecialidad = new JLabel("Especialidad");
        btnEspecialidad = new JButton("Click para escoger especialidad");
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

        panelPrincipal.add(labelName);
        panelPrincipal.add(textName);
        panelPrincipal.add(labelCedula);
        panelPrincipal.add(textCedula);
        panelPrincipal.add(labelTelefono);
        panelPrincipal.add(textTelefono);
        panelPrincipal.add(labelCarnet);
        panelPrincipal.add(textCarnet);
        panelPrincipal.add(labelEspecialidad);
        panelPrincipal.add(btnEspecialidad);
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

    //creacion de clase escuchadora
    private void addListener(){
        btnEspecialidad.addActionListener(new ListenerDoctorFrame(this));
    }

}
