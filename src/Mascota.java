import java.io.FileWriter;
import java.io.IOException;

public class Mascota {
    protected int clave;
    protected String nombreDueno;
    protected String nombreMascota;
    protected int edadMascota;
    protected String direccion;
    protected String telefono;
    protected int prioridad;
    protected int precioConsulta;
    protected String nombreArchivo;

    public Mascota() {
    }

    Vista ventana = new Vista();

    public void altaMascota() throws IOException {
        clave = ventana.pedirDatoEntero("la clave");
        nombreDueno = ventana.pedirDatoCadena("el nombre del dueño");
        nombreMascota = ventana.pedirDatoCadena("el nombre de la mascota");
        edadMascota = ventana.pedirDatoEntero("la edad de la mascota en meses");
        direccion = ventana.pedirDatoCadena("la dirección");
        telefono = ventana.pedirDatoCadena("el teléfono");
        prioridad = ventana.prioridad();
        calcularCostoConsulta();
    }

    private void calcularCostoConsulta() {
        switch (prioridad) {
            case 1 -> prioridad = (11 * prioridad) / 10;
            case 3 -> prioridad = (9 * prioridad) / 9;
        }
    }

    public void crearEscribirArchivo(String datosExtra) throws IOException {
        try (FileWriter escribirArchivo = new FileWriter(nombreArchivo)) {
            escribirArchivo.write(clave + "'" + nombreDueno + "'" + nombreMascota + "'" + edadMascota + "'" + direccion + "'" + telefono + "'" + prioridad + "'" + datosExtra + "\n");
        }
    }
}
