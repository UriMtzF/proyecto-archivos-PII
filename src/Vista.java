import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista {
    public Vista() {
    }
    public String pedirDatoCadena(String dato) {
        String str = "Escribe a continuación " + dato + ": ";
        return JOptionPane.showInputDialog(null, str);
    }

    public int pedirDatoEntero(String dato) {
        String str = "Escribe a continuación " + dato + ": ";
        return Integer.parseInt(JOptionPane.showInputDialog(null, str));
    }

    public boolean pedirDatoBooleano(String dato) {
        Object[] opciones = {"Sí", "No"};
        int ventana = JOptionPane.showOptionDialog(null, dato, "Seleccione una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        return ventana == 0;
    }

    public int prioridad() {
        Object[] opciones = {"Prioridad alta", "Prioridad normal", "Prioridad baja"};
        String str = "Seleccione la prioridad, una prioridad más alta aumenta el precio, una más baja lo disminuye";
        int ventana = JOptionPane.showOptionDialog(null, str, "Seleccione una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        return ventana + 1;
    }

    public String pedirTamanoPerro() {
        Object[] opciones = {"Chico", "Mediano", "Grande"};
        int ventana = JOptionPane.showOptionDialog(null, "Selecciona el tamaño del perro", "Seleccione una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        return switch (ventana) {
            case 0 -> "Chico";
            case 1 -> "Mediano";
            case 2 -> "Grande";
            default -> "Sin dato";
        };
    }

    public void mostrarTexto(StringBuilder texto) {
        String[] lines = texto.toString().split("\n");

        String[] headers = lines[0].split("'");
        int columnCount = headers.length;

        DefaultTableModel model = new DefaultTableModel(0, columnCount);
        model.setColumnIdentifiers(headers);

        for (int i = 1; i < lines.length; i++) {
            String[] values = lines[i].split("'");
            model.addRow(values);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JDialog dialog = new JDialog();
        dialog.setTitle("Información guardada");
        dialog.setModal(true);
        dialog.getContentPane().add(scrollPane);

        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
