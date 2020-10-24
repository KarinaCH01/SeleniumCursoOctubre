package JavaBasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class MainMetodos {

	public static void main(String[] args) {
		Metodos nombreObjeto2= new Metodos(9,3);
		Metodos nombreObjeto= new Metodos();
		Metodos2 objeto = new Metodos2();
		
		//System.out.println(nombreObjeto.sumatoria(5,3));
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		//System.out.println(heredar);
		
		nombreObjeto.mostrarMenjase();
		
		String elementoGuardado= nombreObjeto.mostrarNombre("Sergio");
		
		System.out.println(elementoGuardado);
		Metodos.prueba();
		
		List<String> listaNombres = objeto.listaDeNombre();
		List<Integer> listaNumeros = objeto.listaNumeros();
		
		//esta forma es simplificada, java lo simplifica
		for(String nombre : listaNombres) {
			System.out.println(nombre);
		
			
		}
		System.out.println("for con dos puntos");
		
		
		//Esta jhace lo mismo que lo anteriro pero es la forma tradicional de declarar for para recorrer el arreglo
		for(int indice=0; indice<listaNombres.size(); indice ++) {
			System.out.println (listaNombres.get(indice));
			
		}

		System.out.println("for con index");
		
		//Mostrar lista de numeros
		
		for(int numero: listaNumeros) {
			System.out.println(numero);
			
		}
		
		List<String> nombresSinElemtosDuplicados = listaNombres
				.stream()
				.distinct()
				.collect(Collectors.toList());
		//Ordenado de mayor a menor
		Collections.sort(nombresSinElemtosDuplicados, Collections.reverseOrder());
		System.out.println(nombresSinElemtosDuplicados);
		//ordenado de menor a mayor
		Collections.sort(nombresSinElemtosDuplicados);
		
		System.out.println(nombresSinElemtosDuplicados);
		
		//ORDENAR RLISTA DE NÚMEROS
		
		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
		
		//Quitar los números repetidos de la lista
		
		//SE NECESITA UNA VARIABLE TIPO DE OBJETO que tambipen es de java util
		
		Object last = null;
		
		//Declaramos un contador
		int numCount=0;
		//Usamos la clase interator que tambipen es del java util
		Iterator<Integer> i= listaNumeros.iterator();
		//Enseguida creamos el ciclo while
		// hasNext va interando con cada elemento de la lista y nos regresa un elemento booleano
		while(i.hasNext()) {
			Object temp =i.next();
			if(temp.equals(last)) {
				i.remove();
				numCount++; // numCont= NUMcONT +1;			
				
			}else {
				last=temp;
		
			}
		}//while
		
		System.out.println(numCount); // Si imprimimos el contador se mostrará las veces que se encontraron repetidos
		System.out.println(listaNumeros);
		
		
		
		
	}// main

}
