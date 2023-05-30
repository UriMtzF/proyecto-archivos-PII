import java.io.IOException;

public class Main {
    static Vista ventana = new Vista();

    public static void main(String[] args) throws IOException {
        boolean salir = false;
        while (!salir) {
            int opt = ventana.menuPrincipal();
            switch (opt) {
                case 1:
                    altaMenu();
                    break;
                case 2:
                    consultarMenu();
                    break;
                case 3:
                    salir = true;
                    break;
            }
        }
    }

    public static void altaMenu() throws IOException {
        boolean regresar = false;
        while (!regresar) {
            int opt = ventana.menuSecundario();
            switch (opt) {
                case 1:
                    Perro perro = new Perro();
                    perro.altaMascota();
                    break;
                case 2:
                    Gato gato = new Gato();
                    gato.altaMascota();
                    break;
                case 3:
                    Loro loro = new Loro();
                    loro.altaMascota();
                    break;
                case 4:
                    regresar = true;
                    break;
            }
        }
    }

    public static void consultarMenu() {
        boolean regresar = false;
        while (!regresar) {
            int opt = ventana.menuSecundario();
            switch (opt) {
                case 1:
                    Perro perro = new Perro();
                    perro.consultarPerro();
                    break;
                case 2:
                    Gato gato = new Gato();
                    gato.consultarGato();
                    break;
                case 3:
                    Loro loro = new Loro();
                    loro.consultarLoro();
                    break;
                case 4:
                    regresar = true;
                    break;
            }
        }
    }
}