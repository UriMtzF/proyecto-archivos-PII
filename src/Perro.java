import java.io.IOException;

public class Perro extends Mascota {
    public Perro() {
        precioConsulta = 500;
        nombreArchivo = "Perros.txt";
    }

    @Override
    public void altaMascota() throws IOException {
        super.altaMascota();
        String raza = ventana.pedirDatoCadena("la raza del perro");
        String tamano = ventana.pedirTamanoPerro();
        String datosExtra = raza + "'" + tamano;
        crearEscribirArchivo(datosExtra);
    }

    public void consultarPerro() {
        String categorias = "Raza'Tamaño";
        consultarMascota(categorias);
    }
}
