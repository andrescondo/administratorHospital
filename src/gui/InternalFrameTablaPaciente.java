package gui;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * * Creacion de internalFrame de tabla de pacientes, encargado de generar 
 * un frame de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class InternalFrameTablaPaciente extends JInternalFrame {

    private JPanel panelPrincipal;

    //declaracion de constructor
    public InternalFrameTablaPaciente() {
        initComponents();
    }

    //declaracion de valores inciales para el componente 
    private void initComponents() {
        setSize(600, 200);
        setTitle("Ver Pacientes ::: Kevin Andres Condo Chaguay");
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);

        panelPrincipal = new JPanel(new BorderLayout());
        setContentPane(panelPrincipal);

        Object[] columnsData = {"idHistorial", "nombre", "Apellido",  "cedula", "Dirección"};

        Object[][] rowData = {
            {" ", "", "", "", ""},};

        JTable table = new JTable(rowData, columnsData);
        panelPrincipal.add(table.getTableHeader(), BorderLayout.NORTH);
        panelPrincipal.add(table, BorderLayout.CENTER);
    }

}
