package JavaBasic;

public class Carro {

	//declaración de variable con nombre tipor o inicializarla, sino se inicializa por defautl esta en null o cero.
	//declaradsa aqui es a nivel de clase
	// ks variabes static, en el etodo main, no es necesario hacer referencia a la clase.
	
	/*int numero, numero2;
	double numerosConPuntoDecimal;
	String cadenaDeCaracteres;
	boolean verdaderoOfalso;*/
	
	static int numero;
	
	public static void main (String[] args ) {
		
		//declaradas aqui es a nvel de metodo
		numero=4;
		int numero2=3;
				
		System.out.println(numero+numero2*numero);
		String cadenaDeCaracteres;
		
		cadenaDeCaracteres="Karina Cisneros";
		System.out.println(cadenaDeCaracteres+" Cusro de selenium");
		
		double numerosConPuntoDecimal;
		
		boolean verdaderoOfalso;
		
	}
	
	
}
