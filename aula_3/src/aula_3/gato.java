package aula_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class gato {
    public static void main(String[] args) {
        String Musica = "Atirei o pau no Gato, mas o gato não morreu. Dona chica caca admirou-se no berô no berô que o gato deu MIAU!!.";

     
        System.out.println(Musica);

       

        String[] palavras = Musica.split("\\s+");

        Set<String> palavrasDistintas = new HashSet<>();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) { 
                palavrasDistintas.add(palavra);
            }
        }

      
        System.out.println("Total de palavras distintas (HashSet): " + palavrasDistintas.size());
        System.out.println("Palavras únicas encontradas: " + palavrasDistintas);
    }
}
