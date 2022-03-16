package gui;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * * Creacion de internalFrame de tabla de doctor, encargado de generar 
 * un frame de manera interna del elementos destokp del frame principal
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2022
 * @since  09-03-2022, 22:45 horas
 */
public class InternalFrameTablaDoctor extends JInternalFrame {

    private JPanel panelPrincipal;

    //declaracion de constructor
    public InternalFrameTablaDoctor() {
        initComponents();
    }

    //declaracion de valores 
    private void initComponents() {
        setSize(600, 200);
        setTitle("Ver Doctores ::: Kevin Andres Condo Chaguay");
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);

        panelPrincipal = new JPanel(new BorderLayout());
        setContentPane(panelPrincipal);

        Object[] columnsData = {"carnet", "especialidad", "nombre", "apellido", "telefono", "cedula"};

        Object[][] rowData = {
            {" ", "", "", "", "", ""},};

        JTable table = new JTable(rowData, columnsData);
        panelPrincipal.add(table.getTableHeader(), BorderLayout.NORTH);
        panelPrincipal.add(table, BorderLayout.CENTER);
    }
}
