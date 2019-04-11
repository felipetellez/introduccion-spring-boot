package controladores;

import org.springframework.web.bind.annotation.RestController;

import servicios.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

	
	@Value("${nombreProyecto.spring.nombre}")
	private String nombreProyecto;
	
	@Autowired
	private BusinessService businessService;
	
	
	@RequestMapping(value="/saludar/{nombre}", method=RequestMethod.GET)
    public String index(@PathVariable String nombre) {
        
    	if (nombre.equalsIgnoreCase("juan")) {
    		return "Hola " + nombre; 
    	}else
    		return "No estas admitido";
    	
    }
	
	/*
    @RequestMapping("/saludar")
    public String index() {
        
    	String respuesta = "Nombre del proyecto: "+ this.nombreProyecto;
    	String mensajeServicio = this.businessService.getMetodoEJemplo();
    	return respuesta + "\n" + mensajeServicio ;
    }*/

}