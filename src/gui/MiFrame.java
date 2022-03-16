package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import listener.ListenerMiFrame;

/**
 * * Creacion de internalFrame de tabla de hospitales, encargado de generar 
 * un frame de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class MiFrame extends JFrame {

    private JPanel contentPane;
    private JPanel contentBanner;
    private JLabel labelBannerPrincipal;
    private JMenuBar menuBar;
    private JMenu menuAdministrar;
    private JMenu menuDoctor;
    private JMenu menuHospital;
    private JMenu menuPacientes;
    private JMenuItem crearHospital;
    private JMenuItem verHospital;
    private JMenuItem crearDoctor;
    private JMenuItem verDoctor;
    private JMenuItem crearPaciente;
    private JMenuItem verPaciente;
    private JMenuItem menuSalir;
    private JMenuItem menuConsulta;
    private JDesktopPane desktopPane;

    //creacion de custom color
    private Color colorBackground = new Color(45, 45, 45);

    //creacion de fuentes custom
    //private Font fontBanner = new Font(null, "Arial", 20);
    public MiFrame() {
        super("Kevin Andres Condo Chaguay");
        initComponents();
        //adicion de metodo con colores
        addListener();
    }

    private void initComponents() {
        //estabelece las medidas de la pantalla
        setSize(800, 400);

        //centrar el contenedor de manera default
        setLocationRelativeTo(null);

        //cierra el proceso del programa al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creación de ContentPane
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        //agrego la barra de menú
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //agregar menú
        menuAdministrar = new JMenu("Administrar");
        menuBar.add(menuAdministrar);

        //agrego sub-menú nuevo
        menuHospital = new JMenu("Hospitales");
        menuBar.add(menuHospital);
        menuPacientes = new JMenu("Pacientes");
        menuBar.add(menuPacientes);
        menuDoctor = new JMenu("Doctores");
        menuBar.add(menuDoctor);

        //items del menu hospital
        crearHospital = new JMenuItem("Crear hospital");
        verHospital = new JMenuItem("Ver Hospital");
        menuHospital.add(crearHospital);
        menuHospital.add(verHospital);

        crearDoctor = new JMenuItem("Crear Medico");
        verDoctor = new JMenuItem("Ver Medicos");
        menuDoctor.add(crearDoctor);
        menuDoctor.add(verDoctor);

        crearPaciente = new JMenuItem("Crear Paciente");
        verPaciente = new JMenuItem("Ver Pacientes");
        menuPacientes.add(crearPaciente);
        menuPacientes.add(verPaciente);

        //agrego item salir
        menuSalir = new JMenuItem("Salir");
        menuAdministrar.add(menuSalir);

        //agrego item consulta
        menuConsulta = new JMenuItem("Crear Consulta");
        menuAdministrar.add(menuConsulta);

        //agrego el desktopPane
        desktopPane = new JDesktopPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);

        initColor();

    }

    public JMenuItem getCrearPaciente() {
        return crearPaciente;
    }

    public void setCrearPaciente(JMenuItem crearPaciente) {
        this.crearPaciente = crearPaciente;
    }

    public JMenuItem getVerPaciente() {
        return verPaciente;
    }

    public void setVerPaciente(JMenuItem verPaciente) {
        this.verPaciente = verPaciente;
    }

    
    //declaracion de escuchador de eventos
    private void addListener() {
        crearHospital.addActionListener(new ListenerMiFrame(this));
        verHospital.addActionListener(new ListenerMiFrame(this));
        crearDoctor.addActionListener(new ListenerMiFrame(this));
        crearPaciente.addActionListener(new ListenerMiFrame(this));
        verPaciente.addActionListener(new ListenerMiFrame(this));
        verDoctor.addActionListener(new ListenerMiFrame(this));
        menuConsulta.addActionListener(new ListenerMiFrame(this));
        menuSalir.addActionListener(new ListenerMiFrame(this));

    }

    public JMenuItem getCrearDoctor() {
        return crearDoctor;
    }

    public void setCrearDoctor(JMenuItem crearDoctor) {
        this.crearDoctor = crearDoctor;
    }

    public JMenuItem getVerDoctor() {
        return verDoctor;
    }

    public void setVerDoctor(JMenuItem verDoctor) {
        this.verDoctor = verDoctor;
    }

    public JMenuItem getVerHospital() {
        return verHospital;
    }

    public void setVerHospital(JMenuItem verHospital) {
        this.verHospital = verHospital;
    }

    public JMenuItem getMenuSalir() {
        return menuSalir;
    }

    public void setMenuSalir(JMenuItem menuSalir) {
        this.menuSalir = menuSalir;
    }

    public JMenuItem getCrearHospital() {
        return crearHospital;
    }

    public void setCrearHospital(JMenuItem crearHospital) {
        this.crearHospital = crearHospital;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    //declaracion de clase para adicion de colores a elementos
    private void initColor() {
        desktopPane.setBackground(colorBackground);
        //labelBannerPrincipal.setForeground(colorWhite);
    }

    public JMenuItem getMenuConsulta() {
        return menuConsulta;
    }

    public void setMenuConsulta(JMenuItem menuConsulta) {
        this.menuConsulta = menuConsulta;
    }

}
