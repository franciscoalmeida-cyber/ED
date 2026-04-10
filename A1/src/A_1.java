import java.util.ArrayList;


public class A_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer>numeros = new ArrayList<Integer>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		
		
	System.out.println(numeros.size());
	System.out.println(numeros);
	
	numeros.remove(1);
	
	
	
	System.out.println(numeros);
	
	
	if(numeros.contains(40)) {
		
		System.out.println("encontrado");		
	}else {
		System.out.println("não encontrado");		
		
		
	}
	
	
	
	
	
	
		
	}
	
	
	
}
