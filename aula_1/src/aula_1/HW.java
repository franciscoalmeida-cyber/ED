package aula_1;

public class HW{
	
	public static void main(String[] args) {
		animal a1 = new gato();
		a1.emitirSom();
		a1.setNome("Garfield");
		
		System.out.println(a1.getNome());
		
		
		gato a2 = new gato();
		a2.emitirSom();
		a2.setNome("nomedois");
		System.out.println(a2.getNome());
		cachorro a3  = new cachorro();
		a3.emitirSom();
	}
	
	
	
}