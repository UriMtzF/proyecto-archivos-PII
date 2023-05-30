import java.io.IOException;

public class Gato extends Mascota{

    public Gato() {
        precioConsulta = 400;
        nombreArchivo = "Gatos.txt";
    }

    @Override
    public void altaMascota() throws IOException {
        super.altaMascota();
        String color = ventana.pedirDatoCadena("el color del gato");
        int tamano = ventana.pedirDatoEntero("el tamaño (en cm)");
        String datosExtra = color + "'" + tamano;
        crearEscribirArchivo(datosExtra);
    }
    public void consultarGato() {
        String categorias = "Color'Tamaño";
        consultarMascota(categorias);
    }
}
