package aula_2;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		//String carros[] = 
			//{"Pulse", "Argo", "fastback"};
		//System.out.println(carros[2]);
		
		ArrayList<String> carros 
			= new ArrayList<String>();
		carros.add("Pulse");
		carros.add("Argo");
		carros.add("Fastback");
		carros.add("toro");
		
		System.out.println(carros);
		
		carros.set(1,"palio");
		
		System.out.println(carros);
		
		carros.remove(2);
		
		
		System.out.println(carros);

	}

}
