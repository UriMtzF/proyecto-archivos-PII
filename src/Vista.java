import javax.swing.*;

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
}
