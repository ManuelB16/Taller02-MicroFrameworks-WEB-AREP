package arep.taller2.web.Controller;

import arep.taller2.web.Anotaciones.GetMapping;
import arep.taller2.web.Anotaciones.ReParam;
import arep.taller2.web.Anotaciones.RestController;

/**
 * Controlador del sevicio
 */
@RestController
public class GreetingController {
	//Método static
    //Anotación quie define los métodos a ejecutar
	@GetMapping("/greeting")
	public static String greeting(@ReParam(value = "name", defaultValue = "World") String name) {
		return "Hola " + name;
	}
        
    @GetMapping("/pi")
	public static String pi(@ReParam(value = "name", defaultValue = "World") String name) {
		return Double.toString(Math.PI);
	}
}
