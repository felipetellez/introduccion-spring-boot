package servicios;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	public String getMetodoEJemplo() {
		return "Ejemplo metodo desde servicio Business";
	}
}
