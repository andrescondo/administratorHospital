package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * * Creacion de internalFrame del frame de consulta, encargado de generar 
 * un frame de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class InternalFrameHospital extends JInternalFrame {

    //declaracion de elementos
    private JPanel panelPrincipal;
    private JLabel labelName;
    private JLabel labelRUC;
    private JLabel labelTelefono;
    private JLabel labelDireccion;
    private JPanel labelDireccionBox;
    private JPanel labelFormularioBoton;

    private JLabel labelDireccionBoxCiudad;
    private JLabel labelDireccionBoxCalle;
    private JLabel labelDireccionBoxNumero;

    private JTextField textName;
    private JTextField textRUC;
    private JTextField textTelefono;
    private JTextField textCiudad;
    private JTextField textCalle;
    private JTextField textNumero;

    private JButton btnSave;

    
    //declaracion de constructor
    public InternalFrameHospital() {
        initComponents();
        addListener();
    }

    //declaracion de caracteristicas iniciales del elemento
    private void initComponents() {
        setSize(600, 200);
        setTitle("Crear Hospital ::: Kevin Andres Condo Chaguay");
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);

        GridLayout miGridLayout = new GridLayout(5, 2);
        GridLayout direccionGridLayout = new GridLayout(1, 6);

        //creacion y asignacion de panelPrincipal
        panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(miGridLayout);

        labelName = new JLabel("Nombre");
        textName = new JTextField();
        labelRUC = new JLabel("RUC");
        textRUC = new JTextField();
        labelTelefono = new JLabel("Telefono");
        textTelefono = new JTextField();
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
        panelPrincipal.add(labelRUC);
        panelPrincipal.add(textRUC);
        panelPrincipal.add(labelTelefono);
        panelPrincipal.add(textTelefono);
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

    //clase encargada de escuchar loe eventos
    private void addListener() {

    }
}
