import java.io.IOException;

public class Loro extends Mascota {

    public Loro() {
        precioConsulta = 300;
        nombreArchivo = "Loros.txt";
    }

    @Override
    public void altaMascota() throws IOException {
        super.altaMascota();
        boolean masDeUnColor = !ventana.pedirDatoBooleano("¿Tiene más de dos colores?");
        boolean vuela = ventana.pedirDatoBooleano("¿Vuela?");
        boolean canta = ventana.pedirDatoBooleano("¿Canta?");
        String datosExtra = masDeUnColor + "'" + vuela + "'" + canta;
        crearEscribirArchivo(datosExtra);
    }

    public void consultarLoro() {
        String categorias = "¿Tiene más de un color?'¿Vuela?'¿Canta?";
        consultarMascota(categorias);
    }
}
