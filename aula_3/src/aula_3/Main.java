package aula_3;

import java.util.HashSet;

public class Main {
		public static void main(String[] args) {
			
			HashSet<String> carros = new HashSet<String>();
			carros.add("BMW");
			carros.add("Fiat");
			carros.add("Mercedes");
			carros.add("Audi");
			
			System.out.println(carros);
			
			carros.remove("Fiat");
			
			System.out.println(carros);

		}

}
