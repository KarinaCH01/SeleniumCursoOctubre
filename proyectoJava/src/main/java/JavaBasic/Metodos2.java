package JavaBasic;

import java.util.List;
import java.util.ArrayList;

public class Metodos2 {
	//Herencia delcramos la sig variable
	static String heredar = "Mensaje texto";
	
	public List<String> listaDeNombre() {
		List<String> listaNombre = new ArrayList<>();
			listaNombre.add("Kala");
			listaNombre.add("Kala");
			listaNombre.add("Coco");
			listaNombre.add("Pedro");	
			
		return listaNombre;
		
	}
	
	public List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
			listaNumeros.add(1);
			listaNumeros.add(78);
			listaNumeros.add(1);
			listaNumeros.add(6);
			listaNumeros.add(1);
			listaNumeros.add(12);
			listaNumeros.add(1);
			listaNumeros.add(6);
		
		return listaNumeros;
		
		
	}

}
