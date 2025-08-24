package arep.taller2.web;
import static arep.taller2.web.Utils.HttpServer.*;

public class Microframework {
    
    public static void main(String[] args) {
       
        // Crear un servidor HTTP
        try {
            port(35000);
            staticFiles.location("/static"); // Establecer la ubicación de los archivos estáticos
            run(); // Iniciar el servidor
        } catch (Exception e) {
            System.out.println("Error al iniciar el servidor: " + e.getMessage());
        }

    }

}
